package abstractclass;

public abstract class WorkerAbstractClass {
	
	public String workerName;
	public static int hourlyWork = 100;
	public WorkerAbstractClass(String workerName) {
		this.workerName = workerName;
	}
	
	public abstract double getSalary();
	
}
