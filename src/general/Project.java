package general;

import java.util.LinkedList;

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
	
	

}
