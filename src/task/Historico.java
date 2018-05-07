package task;

import java.util.Date;

public final class Historico {

	Date fechaInicio;
	Date fechaFinalizacion;
	Task_Status estado;
	
	public Historico(Date fechaInicio, Date fechaFinalizacion, Task_Status estado) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.estado = estado;
	}
	
}
