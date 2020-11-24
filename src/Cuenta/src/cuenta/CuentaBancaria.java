package Cuenta.src.cuenta;

public abstract class CuentaBancaria {
	private HistorialMovimientos historialDeMovimientos;
	private Notificador notificador;
	private int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.setHistorialDeMovimientos(historialDeMovimientos);
		this.setNotificador(notificador);
		this.setSaldo(saldo);
	}

	public int getSaldo() {
		return saldo;
	}
	
	public abstract void extraer(Integer monto);

	public HistorialMovimientos getHistorialDeMovimientos() {
		return historialDeMovimientos;
	}

	public void setHistorialDeMovimientos(HistorialMovimientos historialDeMovimientos) {
		this.historialDeMovimientos = historialDeMovimientos;
	}

	public Notificador getNotificador() {
		return notificador;
	}

	public void setNotificador(Notificador notificador) {
		this.notificador = notificador;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void actualizarSaldo(int monto) {
		this.setSaldo(this.getSaldo()-monto);
	}
	
	public void registrarMovimiento(String descripcion, int monto) {
		this.getHistorialDeMovimientos().registrarMovimiento(descripcion, monto);
	}
	
	public void notificarSaldo(CuentaBancaria cuenta) {
		this.getNotificador().notificarNuevoSaldoACliente(cuenta);
	}
	
	public abstract boolean validador(int monto);
	
}
