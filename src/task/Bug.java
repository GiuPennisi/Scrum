package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import status.Status;

public class Bug extends Task{

	//Subtareas debe ser null si o si porque el bug no puede tener subtareas
	//Como evitar que se le carguen subtareas heredando el atributo subtareas?
	// Como máximo, una sola dependencia que debe ser una historia, mejora o tarea.
	
	public Bug(String idTask, String nombreTask, String descripcionTask, int complejidad, LinkedList<Task> dependencias,
			ArrayList<Status> historicoEstado, LinkedList<Task> subtareas, Date fechaFinalizacion) {
		super(idTask, nombreTask, descripcionTask, complejidad, dependencias, historicoEstado, subtareas, fechaFinalizacion);
		// TODO Auto-generated constructor stub
	}

	public void setIdTask(String idTask) {
		this.idTask = "BUG"+ Math.random();
	}
	
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
	
	

}
