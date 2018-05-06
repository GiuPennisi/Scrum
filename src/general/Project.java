package general;

import java.util.LinkedList;

public class Project {

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
