package abstractclass;

public class Bmw extends Car {

	private double price;
	public Bmw(String carName,double price) {
		super(carName);
		this.price = price;
	}

	@Override
	public double carPrice() {
		
		return price;
	}

}
