package abstractclass;

public abstract class Car {
	
	public String carName;
	
	public Car(String carName) {
		this.carName = carName;
	}
	
	public abstract	double carPrice();
	
}
