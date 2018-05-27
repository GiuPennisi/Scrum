package general;

import java.util.LinkedList;
import task.Task;

public class Backlog {
	LinkedList<Task> backlog;

	public Backlog(LinkedList<Task> backlog) {
		super();
		this.backlog = backlog;
	}

	public LinkedList<Task> getBacklog() {
		return backlog;
	}

	public void setBacklog(LinkedList<Task> backlog) {
		this.backlog = backlog;
	}
	
	/*public void nuevaTarea(String nombreTask,String descripcionTask, int complejidadTask,boolean esSubtarea) {
		Task task (nombreTask,descripcionTask,);
		String idTask, String nombreTask, String descripcionTask, int complejidad,
		LinkedList<Task> dependencias, ArrayList<Status> historicoEstado, LinkedList<Task> subtareas
		Date fechaFinalizacion, boolean subtarea)
		task.crear();
		backlog.add(task);
	}*/
	
}
