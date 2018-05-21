package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class New_Feature extends Task{
	
	//SOLO UNA DEPENDENCIA DE TIPO USER STORY O TASK
	//SUBATAREAS?
	
	public New_Feature(String idTask, String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion) {
		super(idTask, nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion);
	}

	public void setIdTask(String idTask) {
		this.idTask = "MEJ"+ Math.random();
	}


	/**
	 * 
	 */
	public int getComplejidad() {
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
	
	//RETORNA 1 SI PUEDE TENER DEPENDENCIAS 0 SI NO PUEDE
	
	public int permisoDependencias() {
		return 1;
	}
		
	//CREA UN ARREGLO CON LOS TIPOS DE DEPENDENCIAS QUE PUEDE TENER Y CANTIDAD MAXIMA
	
	public void tipoDependencias (ArrayList<String> tipo, int maxCant) {
		tipo.add("User Story");
		tipo.add("Task");
		maxCant=1;
	}
	
	//RETORNA 1 SI PUEDE TENER SUBTAREAS 0 SI NO PUEDE
	
	public int permisoSubtarea() {
		return 1;
	}
	
	//CREA UN ARREGLO CON LOS TIPOS DE SUBTAREAS QUE PUEDE TENER Y CANTIDAD MAXIMA
	
	public void tipoSubtareas (ArrayList<String> tipo, int maxCant) {
		tipo.add("Task");
		//SE UTILIZA EL 999 COMO SINONIMO DE QUE PUEDE TENER TODAS LAS NECESARIAS
		maxCant=999;
	}
	
}