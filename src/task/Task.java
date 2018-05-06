package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

public class Task {

	UUID idTask = UUID.randomUUID();
	String nombreTask;
	String descripcionTask;
	Task_Status taskStatus;
	ArrayList<Historico> historicoStatus;
	int complejidad;
	LinkedList<Task> dependencias;
	//tipo Task (tarea generica) donde las subtareas no pueden tener subtareas ni complejidad asignada (??
	LinkedList<Task> subtareas;
	Date fechaFinalizacion;
	
	
	public Task(UUID idTask, String nombreTask, String descripcionTask, Task_Status taskStatus,
			ArrayList<Historico> historicoStatus, int complejidad, LinkedList<Task> dependencias,
			LinkedList<Task> subtareas, Date fechaFinalizacion) {
		super();
		this.idTask = idTask;
		this.nombreTask = nombreTask;
		this.descripcionTask = descripcionTask;
		this.taskStatus = taskStatus;
		this.historicoStatus = historicoStatus;
		this.complejidad = complejidad;
		this.dependencias = dependencias;
		this.subtareas = subtareas;
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public UUID getIdTask() {
		return idTask;
	}

	public void setIdTask(UUID idTask) {
		this.idTask = idTask;
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

	public Task_Status getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(Task_Status taskStatus) {
		this.taskStatus = taskStatus;
	}

	public ArrayList<Historico> getHistoricoStatus() {
		return historicoStatus;
	}

	public void setHistoricoStatus(ArrayList<Historico> historicoStatus) {
		this.historicoStatus = historicoStatus;
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
