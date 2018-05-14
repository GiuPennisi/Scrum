package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class User_Story extends Task{
	
	
	//las dependencias no pueden ser bugs ni mejoras.
	
	
	ArrayList<Flow> pasosHistoria;

	public User_Story(String idTask, String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion, ArrayList<Flow> pasosHistoria) {
		super(idTask, nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas,
				fechaFinalizacion);
		this.pasosHistoria = pasosHistoria;
	}

	public void setIdTask(String idTask) {
		this.idTask = "HIS"+ Math.random();
	}
	
	public float promedioPasos() {
		int suma=0;
		Iterator <Flow> arrayIterator = pasosHistoria.iterator();
		while (arrayIterator.hasNext()) {
			suma+=arrayIterator.next().getSteps();
		}
		return suma/pasosHistoria.size();
	}
	
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

	public int getEstimacion(){
		return (int) Math.round((getComplejidad()+calculaPromedioEstimacion()));
	}
}
