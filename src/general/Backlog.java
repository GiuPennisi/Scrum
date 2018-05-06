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
	
	
	
}
