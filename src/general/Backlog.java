package general;

import java.util.LinkedList;
import java.util.ListIterator;

import task.Bug;
import task.Task;

public class Backlog<string> {
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
	public static LinkedList<Bug> listaBugs;
	
	public boolean estaBug(string NOMBREBUG, LinkedList<Bug> lista) {
		boolean esta = false;
		Bug nodoBug = null;
		if (lista != null) {
			ListIterator<Bug> iterador = lista.listIterator();
			while (iterador.hasNext()) {
				nodoBug = iterador.next();
				if (nodoBug.getNumBug() == NOMBREBUG) {
					esta = true;
				}
			}
		}
		return esta;
	}
}
