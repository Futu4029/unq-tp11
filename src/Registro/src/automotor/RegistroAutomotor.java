package Registro.src.automotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {		
		return  this.tieneUnAnioDeAntiguedad(fecha, vehiculo)&&
				this.noEsVehiculoPolicial(vehiculo)&&
				this.estaRadicadoEnBuenosAires(vehiculo);
	}

	public boolean tieneUnAnioDeAntiguedad(LocalDate fecha, Vehiculo vehiculo) {
		LocalDate fechaFabricacion = vehiculo.getFechaFabricacion();
		return  fecha.minusYears(1).isAfter(fechaFabricacion);
	}

	public boolean noEsVehiculoPolicial(Vehiculo vehiculo) {
		return !vehiculo.esVehiculoPolicial();
	}

	public boolean estaRadicadoEnBuenosAires(Vehiculo vehiculo) {
		String ciudadRadicacion = vehiculo.ciudadRadicacion();
		return ciudadRadicacion.equalsIgnoreCase("Buenos Aires");
	}

}
