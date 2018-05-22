package status;

import task.Task_Status;

public class Testing extends Status{

	public Testing() {
		super("Testing", "Lorem ipsum dolor sit amet, consectetur adipiscing elit");
		
		anterior = Task_Status.TO_DO;
		siguiente = Task_Status.DONE;
	}

	

}
