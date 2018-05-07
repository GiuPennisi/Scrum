package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

import status.Status;

public class Bug extends Task{

	//Subtareas debe ser null si o si porque el bug no puede tener subtareas
	//Como evitar que se le carguen subtareas heredando el atributo subtareas?
	//Si dependencias es una sola (US) para que heredar toda la lista si solo va a tener una?
	
	User_Story dependencia;
	
	public Bug(UUID idTask, String nombreTask, String descripcionTask, Status taskStatus,
			ArrayList<Historico> historicoStatus, int complejidad, LinkedList<Task> dependencias,
			LinkedList<Task> subtareas, Date fechaFinalizacion, User_Story dependencia) {
		super(idTask, nombreTask, descripcionTask, taskStatus, historicoStatus, complejidad, dependencias, subtareas,
				fechaFinalizacion);
		this.dependencia = dependencia;
	}

	public User_Story getDependencia() {
		return dependencia;
	}

	public void setDependencia(User_Story dependencia) {
		this.dependencia = dependencia;
	}

	public int getComplejidad() {
		if (dependencia!=null) {
			return getComplejidad()+(int)Math.round(dependencia.getComplejidad()*0.1);
		}
		else {
			return complejidad;
		}
	}
	
	

}
