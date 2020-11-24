package Cuenta.src.cuenta;

public class CuentaCorriente extends CuentaBancaria{
	private Integer limiteDescubierto;
	
	public CuentaCorriente(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo, Integer limiteDescubierto) {
		super(historialDeMovimientos, notificador, saldo);
		this.setLimiteDescubierto(limiteDescubierto);
	}
	
	@Override
	public void extraer(Integer monto) {
		if(this.validador(monto))
			this.actualizarSaldo(monto);
			this.registrarMovimiento("Extracción", monto);
			this.notificarSaldo(this);
	}

	@Override
	public boolean validador(int monto) {
		return this.getSaldo() + this.getLimiteDescubierto() >= monto;
	}

	public Integer getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(Integer limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

}
