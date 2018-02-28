package abstractclass;

public class Honda extends Car{

	private double price;
	public Honda(String carName,double price) {
		super(carName);
		this.price = price;
		
	}

	@Override
	public double carPrice() {
	
		return price ;
	}

}
