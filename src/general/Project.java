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
		int i=0, j=0;
		while((sprintIterator.hasNext()) & (i==0)){
			if(sprintIterator.next().equals(sprintEnCurso)) { //Si encuentra el sprint en la lista
				i=1;
				while((sprintIterator.hasNext()) & (j==0)) {  
					if (sprintIterator.next().getEstadoSprint().equals(Sprint_Status.EN_CURSO)) { //Encuentra el proximo sprint en curso
						sprintIterator.next().setTareasUndone(tasksUndone);
						j=1;
					   }
				     }
			   } 
		    }		//Si i=0, no existe el sprint de entrada.    Si j=0, no hay mas sprints en curso.
   }

}
