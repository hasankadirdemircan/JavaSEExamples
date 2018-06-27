package staticexample;

public class StaticExample2 {

	public static void main(String[] args) {
		
		//static variable in degeri her obje olusturdugumuzda artacaktir.
		//cunku static variable JVM calistiginda calismaya baslar
		//ve method ile isimiz bitince variable sonlanmaz./
	
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		Counter counter3 = new Counter();
		System.out.println(counter3.count);
		System.out.println(Counter.count);
		
		//instance variable static gibi degildir.
		//class'a erisim sagladigimizda bir onceki degeri olmus olur.
		Counter2 counter4 = new Counter2();
		Counter2 counter5 = new Counter2();
		System.out.println(counter5.count);
		
	}
}


class Counter {
	
	static int count = 0;
	
	Counter(){
		count++;
	}
	
}

class Counter2 {
	
	int count = 0;
	
	Counter2(){
		count++;
	}
	
}