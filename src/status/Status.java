package status;

import java.util.Date;

import task.Task_Status;

public abstract class Status {

	static String nombre;
	static String descripcion;
	Task_Status anterior = null;
	Task_Status siguiente = null;
	Date fecha;
	
	public Status(String nombre, String descripcion) {
		Status.nombre = nombre;
		Status.descripcion = descripcion;
		this.anterior = null;
		this.siguiente = null;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		Status.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		Status.descripcion = descripcion;
	}
	
	public Task_Status getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Task_Status anterior) {
		this.anterior = anterior;
	}
	
	public Task_Status getSiguiente() {
		return siguiente;
	}
	
	public void setSiguiente(Task_Status siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
