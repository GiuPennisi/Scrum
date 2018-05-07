package task;

public final class Flow {

	String descripcion;
	int steps;
	
	public Flow(String descripcion, int steps) {
		super();
		this.descripcion = descripcion;
		this.steps = steps;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public int getSteps() {
		return steps;
	}
	
	public void setSteps(int steps) {
		this.steps = steps;
	}
	
}
