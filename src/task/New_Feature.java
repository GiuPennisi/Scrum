package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

import status.Status;

public class New_Feature extends Task{

	//Las dependencias solo pueden ser US o tasks
	Task dependencia;
		
	public New_Feature(UUID idTask, String nombreTask, String descripcionTask, Status taskStatus,
			ArrayList<Historico> historicoStatus, int complejidad, LinkedList<Task> dependencias,
			LinkedList<Task> subtareas, Date fechaFinalizacion, Task dependencia) {
		super(idTask, nombreTask, descripcionTask, taskStatus, historicoStatus, complejidad, dependencias, subtareas,
				fechaFinalizacion);
		this.dependencia = dependencia;
	}

	public Task getDependencia() {
		return dependencia;
	}

	public void setDependencia(Task dependencia) {
		this.dependencia = dependencia;
	}

	public int getComplejidad() {
		if (dependencia!=null) {
			return getComplejidad()+(int)Math.round(dependencia.getComplejidad()*0.5);
		}
		else {
			return complejidad;
		}
	}
	
}
