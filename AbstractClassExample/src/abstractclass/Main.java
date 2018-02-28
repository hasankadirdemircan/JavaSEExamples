package abstractclass;

public class Main {
	
	public static void main(String[] args) {
		
		Honda honda = new Honda("Honda",30.850);
		Bmw bmw = new Bmw("Bmw",50.876);
		
		//Honda
		System.out.println("Car Name : " + honda.carName);
		System.out.println("Car Price :" + honda.carPrice());
		
		//Bmw
		System.out.println("Car Name : " + bmw.carName);
		System.out.println("Car Price : "+ bmw.carPrice());
	}

}
