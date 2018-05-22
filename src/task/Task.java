package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

import status.Status;



public class Task {

	//0 O MAS DEPENDENCIAS (CUALQUIER TIPO)
	// 0 O MAS SUBTAREAS (SOLO TIPO TASK)
		//SUBTAREAS NO PUEDEN TENER SUBTAREAS NI COMPLEJIDAD
	
	String idTask;
	String nombreTask;
	String descripcionTask;
	int complejidad;
	LinkedList<Task> dependencias;
	ArrayList<Status> historicoEstado;
	LinkedList<Task> subtareas;
	Date fechaFinalizacion;
	boolean subtarea;
	
	public Task(String idTask, String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion, boolean subtarea) {
		super();
		this.idTask = idTask;
		this.nombreTask = nombreTask;
		this.descripcionTask = descripcionTask;
		this.complejidad = complejidad;
		this.dependencias = dependencias;
		this.historicoEstado = historicoEstado;
		this.subtareas = subtareas;
		this.fechaFinalizacion = fechaFinalizacion;
		Status estadoInicial = null;
		historicoEstado.add(estadoInicial);
		this.subtarea=false;
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
	
	
	public ArrayList<Status> getHistoricoEstado() {
		return historicoEstado;
	}

	public void setHistoricoEstado(ArrayList<Status> historicoEstado) {
		this.historicoEstado = historicoEstado;
	}

	public boolean isSubtarea() {
		return subtarea;
	}

	public void setSubtarea(boolean subtarea) {
		this.subtarea = subtarea;
	}

	/**
	 * La estimacion de una Task es un valor unico
	 * @return valor entero (puntos de complejidad)
	 */
	public int getEstimacion() {
		return complejidad;
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
	
	/**
	 * Metodo para saber si puede tener dependencias o no
	 * @return 1 si puede, 0 si no puede
	 */
	public int permisoDependencias() {
		return 1;
	}
	
	/**
	 * Crea un arreglo con los tipos de dependencias que puede tener
	 * @param tipo Arreglo con los tipos de dependencias que puede tener
	 * @param maxCant maxima cantidad de dependencias que puede tener, 999 indica que no hay limite
	 */
	public void tipoDependencias (ArrayList<String> tipo, int maxCant) {
		tipo.add("Task");
		tipo.add("Bug");
		tipo.add("New Feature");
		tipo.add("User Story");
		maxCant=999;
	}
	
	/**
	 * Metodo para saber si puede tener subtareas o no
	 * @return 1 si puede, 0 si no puede
	 */
	public int permisoSubtarea() {
		return 1;
	}
	
	/**
	 * Crea un arreglo con los tipos de dependencias que puede tener
	 * @param tipo Arreglo con los tipos de subtareas que puede tener
	 * @param maxCant maxima cantidad de subatareas que puede tener, 999 indica que no hay limite
	 */
	public void tipoSubtareas (ArrayList<String> tipo, int maxCant) {
		tipo.add("Task");
		maxCant=999;
	}
}
