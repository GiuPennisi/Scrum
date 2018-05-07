package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;

import status.Status;

public class User_Story extends Task{
	
	
	//Como indicar que solo quiero que sea objeto de tipo padre y no de los hijos?
	Task dependencia;
	
	public User_Story(UUID idTask, String nombreTask, String descripcionTask, Status taskStatus,
			ArrayList<Historico> historicoStatus, int complejidad, LinkedList<Task> dependencias,
			LinkedList<Task> subtareas, Date fechaFinalizacion, Task dependencia) {
		super(idTask, nombreTask, descripcionTask, taskStatus, historicoStatus, complejidad, dependencias, subtareas,
				fechaFinalizacion);
		this.dependencia = dependencia;
	}

	public float calculaPromedioEstimacion() {
		float prom=0; int cant=0;
		
		Iterator<Task> iterator = dependencias.iterator(); 
		while (iterator.hasNext()) {
			prom = iterator.next().getComplejidad();
			cant ++;
		}
		if (cant!=0)
			return prom/cant;
		else
			return 0;
	}

	public int getEstimacion(){
		return (int) Math.round((getComplejidad()+calculaPromedioEstimacion()));
	}
}
