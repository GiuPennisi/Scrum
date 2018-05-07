package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class New_Feature extends Task{
	
	public New_Feature(String idTask, String nombreTask, String descripcionTask, int complejidad,
			LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas,
			Date fechaFinalizacion) {
		super(idTask, nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion);
	}

	public void setIdTask(String idTask) {
		this.idTask = "MEJ"+ Math.random();
	}

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
}