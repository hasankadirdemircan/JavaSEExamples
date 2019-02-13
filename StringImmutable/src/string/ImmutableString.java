package string;

public class ImmutableString {

	public static void main(String[] args) {
		String name = "java";
		name.concat("immutable");
		System.out.println(name);//immutable degismez. Ekrana java yazar.
		
		//icerigi degistirmek icin assign islemi yapmak zorundayiz.
		name = name.concat("immutable");
		System.out.println(name);
		
		String firstName = "kadir";
		firstName = firstName.concat("demircan");
		//kadir ve demircan farkli alanlarda yasar.
		//kadir demircan farkli bir alan olusur orada yasar.
		
	}
}
