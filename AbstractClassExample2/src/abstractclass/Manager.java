package abstractclass;

public class Manager extends WorkerAbstractClass {

	private int hour;
	public Manager(String workerName,int hour) {
		super(workerName);
		this.hour = hour;
	}

	@Override
	public double getSalary() {
	
		return hourlyWork * hour;
	}

}
