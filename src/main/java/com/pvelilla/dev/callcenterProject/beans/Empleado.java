/**
 * 
 */
package com.pvelilla.dev.callcenterProject.beans;

/**
 * @author pablyuchenko
 *
 */
public class Empleado {
	private String nombres;
	private String apellidos;
	private String celular;
	private String jerarquia;
	private boolean ocupado;
	
	public Empleado(String nombres, String apellidos, String celular, String jerarquia, boolean ocupado){
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.celular = celular;
		this.jerarquia = jerarquia;
		this.ocupado = ocupado;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getJerarquia() {
		return jerarquia;
	}
	public void setJerarquia(String jerarquia) {
		this.jerarquia = jerarquia;
	}
	public boolean isOcupado() {
		return ocupado;
	}
	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
