package general;

import java.util.Iterator;
import java.util.LinkedList;
import task.Task;

public class Project {

	//CONTROLAR QUE SI LA LISTA DE SPRINTS TIENE UN ELEMENTO CON STATUS IN PROGRESS NO PUEDE HABER OTRO MAS
	
	
	Backlog backlog;
	LinkedList<Sprint> sprints;
	
	public Project(Backlog backlog, LinkedList<Sprint> sprints) {
		super();
		this.backlog = backlog;
		this.sprints = sprints;
	}
	
	public Backlog getBacklog() {
		return backlog;
	}
	
	public void setBacklog(Backlog backlog) {
		this.backlog = backlog;
	}
	
	public LinkedList<Sprint> getSprints() {
		return sprints;
	}
	
	public void setSprints(LinkedList<Sprint> sprints) {
		this.sprints = sprints;
	}
	
	public void cambioEstadoAFinalizado(Sprint sprintEnCurso) {
		LinkedList<Task> tasksUndone= new LinkedList<Task>();
		tasksUndone=sprintEnCurso.getTareasUndone(); 
		Iterator<Sprint> sprintIterator = sprints.iterator();
		while(sprintIterator.)
		
	}

}
