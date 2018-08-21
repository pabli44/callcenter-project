/**
 * 
 */
package com.pvelilla.dev.callcenterProject.beans;

/**
 * @author pablyuchenko
 *
 */
public class Llamada {
	private int duracion;
	private Empleado responsable;
	
	public Llamada(int duracion, Empleado responsable){
		this.duracion = duracion;
		this.responsable = responsable;
	}
	
	/**
	 * 
	 */
	public Llamada() {
		// TODO Auto-generated constructor stub
	}

	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public Empleado getResponsable() {
		return responsable;
	}
	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}
}
