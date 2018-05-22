package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class User_Story extends Task{
	
	//SUBTAREAS?
	
	ArrayList<Flow> pasosHistoria;
	
	public User_Story(String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion, boolean subtarea) {
		super(nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion,
				subtarea);
	}

	public void setIdTask() {
		this.idTask = "HIS"+ Math.random();
	}
	
	/**
	 * Calcula el promedio de pasos que posee la user story  
	 * @return 0 si no tiene pasos, o el promedio de los mismos si los tiene
	 */
	public float promedioPasos() {
		int suma=0;
		Iterator <Flow> arrayIterator = pasosHistoria.iterator();
		while (arrayIterator.hasNext()) {
			suma+=arrayIterator.next().getSteps();
		}
		if (pasosHistoria.isEmpty())
			return 0;
		else
			return suma/pasosHistoria.size();
	}
	
	/**
	 * Calcula el promedio de la complejidad de las dependencias que posee
	 * @return valor promedio de la complejidad de sus dependencias (si es que tiene)
	 */
	public float calculaPromedioEstimacion() {
		float prom=0; int cant=0;
		
		Iterator<Task> iterator = dependencias.iterator(); 
		while (iterator.hasNext()) {
			prom = iterator.next().getComplejidad();
			cant ++;
		}
		if (cant!=0)
			return (float) (prom/cant+promedioPasos()*0.1);
		else
			return 0;
	}

	/**
	 * La complejidad es la suma entre la complejidad asignada y ka estimacion 
	 */
	public int getEstimacion(){
		return (int) Math.round((getComplejidad()+calculaPromedioEstimacion()));
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
