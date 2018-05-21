package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class Bug extends Task{

	//NO PUEDE TENER SUBTAREAS
	//DEPENDENCIA SOLO PUEDE SER USER STORY, NEW FEATURE O TASK
	
	public Bug(String idTask, String nombreTask, String descripcionTask, int complejidad, LinkedList<Task> dependencias,
			ArrayList<Status> historicoEstado, LinkedList<Task> subtareas, Date fechaFinalizacion) {
		super(idTask, nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion);
	}

	public void setIdTask(String idTask) {
		this.idTask = "BUG"+ Math.random();
	}
	
	/**
	 * La estimacion esta dada por la complejidad asignada mas 1/10 de la estimacion de la tarea de la que depende (si es que tiene)
	 * DEPENDENCIA != TAREA DE LA QUE DEPENDE, REALIZAR METODO DE BUSQUEDA PARA VER DE QUE TAREA DEPENDE EN ¿EL SPRINT ACTIVO SOLAMENTE?
	 * @return valor entero con la estimacion del bug
	 */
	public int getComplejidad() {
		Iterator<Task> listIterator = dependencias.iterator();
		int a=0;
		while (listIterator.hasNext()) {
			a=listIterator.next().getComplejidad()+(int)Math.round(listIterator.next().getComplejidad()*0.1);
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
		tipo.add("New Feature");
		tipo.add("Task");
		maxCant=1;
	}
	
	/**
	 * Metodo para saber si puede tener subtareas o no
	 * @return 1 si puede, 0 si no puede
	 */
	public int permisoSubtarea() {
		System.out.println("No se pueden añadir subtareas a los bugs");
		return 0;
	}
	
	/**
	 * Crea un arreglo con los tipos de dependencias que puede tener
	 * @param tipo Arreglo con los tipos de subtareas que puede tener
	 * @param maxCant maxima cantidad de subatareas que puede tener, 999 indica que no hay limite
	 */
	public void tipoSubtareas (ArrayList<String> tipo, int maxCant) {
		tipo=null;
		maxCant=0;
	}

}
