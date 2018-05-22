package status;

import task.Task_Status;

public class ToDo extends Status{

	public ToDo() {
		super("To Do", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
		siguiente = Task_Status.IN_PROGRESS;
	}


}
