package general;

import java.sql.Date;
import java.util.Iterator;
import java.util.LinkedList;

import task.Task;
import task.Task_Status;

public class Sprint {
	LinkedList<Task> tasks;
	Sprint_Status estadoSprint;
	Date fechaInicio;
	Date fechaFinalizacion;
	int duracion;
	
	//Avance es la cantidad de dias restantes desde que inicia el sprint hasta la fecha de finalizacion.
	//Cada dia se resta un dia del total
	int avance;
	
	public Sprint(LinkedList<Task> tasks, Sprint_Status estadoSprint, Date fechaInicio, Date fechaFinalizacion,
		int duracion, int avance) {
		super();
		this.tasks = tasks;
		this.estadoSprint = estadoSprint;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.duracion = duracion;
		this.avance = avance;
	}
	
	public LinkedList<Task> getTasks() {
		return tasks;
	}
	
	public void setTasks(LinkedList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public Sprint_Status getEstadoSprint() {
		return estadoSprint;
	}
	
	public void setEstadoSprint(Sprint_Status estadoSprint) {
		this.estadoSprint = estadoSprint;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}
	
	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getAvance() {
		return avance;
	}
	
	public void setAvance(int avance) {
		this.avance = avance;
	}
	
	public void cambioEstadoACurso(Sprint_Status nuevoEstado, Date fechaInic, Date fechaFin, int diasDuracion, int diasAvance) {
		if ( (estadoSprint.equals(Sprint_Status.PLANIFICADO)) ) { //planificado->en curso{
																	  	
			estadoSprint = Sprint_Status.EN_CURSO;
			fechaInicio = fechaInic;
			fechaFinalizacion = fechaFin;
			duracion = diasDuracion;
			avance = diasAvance;            // cuantos dias quedan para pasar a finalizado (restar la duracion por cada dia que pasa)
		}
		
		/*else { 			 
			  if( (estadoSprint.equals(Sprint_Status.EN_CURSO)) ) {	// en curso->finalizado
				  Iterator<Task> tasksIterator = tasks.iterator();
				  while( tasksIterator.hasNext()){
					  
					  
				  }
				  
			  }
				 
			 
		}*/ //
	}
	
	public LinkedList<Task> getTareasUndone() {
		LinkedList<Task> tasksUndone= new LinkedList<Task>(); //Lista con las tareas pendientes
		if( (estadoSprint.equals(Sprint_Status.EN_CURSO)) ) {
			 Iterator<Task> tasksIterator = tasks.iterator();
					 while( tasksIterator.hasNext()){
				 if (! (tasksIterator.next().getEstadoTask().equals(Task_Status.DONE))) {
					 tasksUndone.add(tasksIterator.next());
					 tasksIterator.remove();					   //Borra las pendientes para dejar solo las finalizadas
			 	 }
		    }
	    }
		//return taskUndone;
		return null; //PONGO ESTE RETURN NULL PARA QUE NO TIRE ERROR
		//return tasksUndone;			//Devuelvo la lista de tareas pendientes
  }
}