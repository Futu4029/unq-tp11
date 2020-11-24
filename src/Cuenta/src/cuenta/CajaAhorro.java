package Cuenta.src.cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public void extraer(Integer monto) {
		if(this.validador(monto)) {
			this.actualizarSaldo(monto);
			this.registrarMovimiento("Extracción", monto);
			this.notificarSaldo(this);
		}
	}
	
	public boolean validador(int monto) {
		return this.getSaldo() >= monto;
	}

}
