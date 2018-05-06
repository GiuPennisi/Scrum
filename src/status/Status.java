package status;

import task.Task_Status;

public abstract class Status {

	String nombre;
	String descripcion;
	Task_Status anterior = null;
	Task_Status siguiente = null;
	
	public Status(String nombre, String descripcion, Task_Status anterior, Task_Status siguiente) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
