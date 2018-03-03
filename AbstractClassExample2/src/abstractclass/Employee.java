package abstractclass;

public class Employee extends WorkerAbstractClass {

	private int hour;
	
	public Employee(String workerName,int hour) {
		super(workerName);
		this.hour = hour;
	}
	
	@Override
	public double getSalary() {
		
		return hourlyWork * hour;
	}

	
}
