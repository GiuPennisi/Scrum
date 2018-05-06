package task;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.UUID;

public class User_Story extends Task{

	public User_Story(UUID idTask, String nombreTask, String descripcionTask, Task_Status taskStatus,
			ArrayList<Historico> historicoStatus, int complejidad, LinkedList<Task> dependencias,
			LinkedList<Task> subtareas, Date fechaFinalizacion) {
		super(idTask, nombreTask, descripcionTask, taskStatus, historicoStatus, complejidad, dependencias, subtareas,
				fechaFinalizacion);
	}
	
	public float calculaPromedioEstimacion() {
		ListIterator<Task> iterator = dependencias.listIterator();
		float prom=0; int cant=0;
		while (iterator.hasNext()) {
			prom = iterator.
		}
	}

}
