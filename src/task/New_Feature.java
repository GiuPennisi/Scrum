package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class New_Feature extends Task{
	
	//SUBATAREAS?
	
	public New_Feature(String idTask, String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion, boolean subtarea) {
		super(idTask, nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion,
				subtarea);
	}

	public void setIdTask(String idTask) {
		this.idTask = "MEJ"+ Math.random();
	}

	/**
	 * Se calcula la estimacion en base a las tareas de las que depende y el valor inicial de complejidad
	 * @return complejidad inicial (si es dependiente de alguna US o task) o el valor inicial de complejidad si no depende de nada
	 */
	public int getEstimacion() {
		Iterator<Task> listIterator = dependencias.iterator();
		int a=0;
		while (listIterator.hasNext()) {
			a=listIterator.next().getComplejidad()+(int)Math.round(listIterator.next().getComplejidad()*0.5);
		}
		if (a==0)
			return getComplejidad();
		else
			return a;
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
		tipo.add("User Story");
		tipo.add("Task");
		maxCant=1;
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