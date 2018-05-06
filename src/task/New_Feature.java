package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.UUID;

public class New_Feature extends Task{

	Task dependencia;

	public New_Feature(UUID idTask, String nombreTask, String descripcionTask, Task_Status taskStatus,
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
		int  calculaComplejidad = 0;
		if (dependencia!=null) {
			return calculaComplejidad = getComplejidad()+(int)Math.round(dependencia.getComplejidad()*0.5);
		}
		else {
			return getComplejidad();
		}
	}
	
}
