package Registro.src.automotor;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;	
	private String ciudadRadicacion; 
	
	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.setEsVehiculoPolicial(esVehiculoPolicial);
		this.setFechaFabricacion(fechaFabricacion);
		this.setCiudadRadicacion(ciudadRadicacion);
	}

	public Boolean esVehiculoPolicial() {
		return getEsVehiculoPolicial();
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return getCiudadRadicacion();
	}

	public Boolean getEsVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public void setEsVehiculoPolicial(Boolean esVehiculoPolicial) {
		this.esVehiculoPolicial = esVehiculoPolicial;
	}

	public void setFechaFabricacion(LocalDate fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	public String getCiudadRadicacion() {
		return ciudadRadicacion;
	}

	public void setCiudadRadicacion(String ciudadRadicacion) {
		this.ciudadRadicacion = ciudadRadicacion;
	}
}
