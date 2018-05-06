package general;

import java.util.Date;
import java.util.LinkedList;

import task.Task;

public class Sprint {
	LinkedList<Task> tasks;
	Sprint_Status estadoSprint;
	Date fechaInicio;
	Date fechaFinalizacion;
	int duracion;
	//Avance es la cantidad de dias restantes desde que inicia el sprint hasta la fecha de finalizacion.
	//Cada dia se resta un dia del total
	int avance;
	public Sprint(LinkedList<Task> tasks, Sprint_Status estadoSprint, Date fechaInicio, Date fechaFinalizacion,
			int duracion, int avance) {
		super();
		this.tasks = tasks;
		this.estadoSprint = estadoSprint;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.duracion = duracion;
		this.avance = avance;
	}
	
	public LinkedList<Task> getTasks() {
		return tasks;
	}
	
	public void setTasks(LinkedList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public Sprint_Status getEstadoSprint() {
		return estadoSprint;
	}
	
	public void setEstadoSprint(Sprint_Status estadoSprint) {
		this.estadoSprint = estadoSprint;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}
	
	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getAvance() {
		return avance;
	}
	
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	
}
