package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import status.Status;



public class Task {

	String idTask;
	String nombreTask;
	String descripcionTask;
	int complejidad;
	LinkedList<Task> dependencias;
	ArrayList<Status> historicoEstado;
	//tipo Task (tarea generica) donde las subtareas no pueden tener subtareas ni complejidad asignada (??
	LinkedList<Task> subtareas;
	Date fechaFinalizacion;

	public Task(String idTask, String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion) {
		super();
		this.idTask = idTask;
		this.nombreTask = nombreTask;
		this.descripcionTask = descripcionTask;
		this.complejidad = complejidad;
		this.dependencias = dependencias;
		this.historicoEstado = historicoEstado;
		this.subtareas = subtareas;
		this.fechaFinalizacion = fechaFinalizacion;
		Status estadoInicial = null; //tomar fecha actual, 
		historicoEstado.add(estadoInicial);
	}

	public String getIdTask() {
		return idTask;
	}

	public void setIdTask(String idTask) {
		this.idTask = "TAR"+ Math.random();
	}

	public String getNombreTask() {
		return nombreTask;
	}

	public void setNombreTask(String nombreTask) {
		this.nombreTask = nombreTask;
	}

	public String getDescripcionTask() {
		return descripcionTask;
	}

	public void setDescripcionTask(String descripcionTask) {
		this.descripcionTask = descripcionTask;
	}

	public int getComplejidad() {
		return complejidad;
	}

	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}

	public LinkedList<Task> getDependencias() {
		return dependencias;
	}

	public void setDependencias(LinkedList<Task> dependencias) {
		this.dependencias = dependencias;
	}

	public LinkedList<Task> getSubtareas() {
		return subtareas;
	}

	public void setSubtareas(LinkedList<Task> subtareas) {
		this.subtareas = subtareas;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
}
