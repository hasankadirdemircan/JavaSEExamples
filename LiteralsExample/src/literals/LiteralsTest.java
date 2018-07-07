package literals;

public class LiteralsTest {

	public static void main(String[] args) {
		LiteralsTest object = new LiteralsTest();
		object.intLiterals();
		object.charLiterals();
		object.doubleLiterals();
		object.floatLiterals();
		
	}
	

	public void intLiterals() {
		int intLiteral = 10; //decimal literals
		System.out.println(intLiteral);
		
		int hexLiteral1 = 0x10;//hexdecimal literals basinda 0x olur.
		int hexLiteral2 = 0xA1;
		System.out.println(hexLiteral1);
		System.out.println(hexLiteral2);
		
		int octalLiteral = 021;//octal literals basinda 0(sifir) olur.
		System.out.println(octalLiteral);
		
		int binaryLiteral = 0b111;//binary literal basinda 0b olur.
		System.out.println(binaryLiteral);
		
	}
	
	//char : 16 bit.
	public void charLiterals() {
		char characterA = 65;
		System.out.println(characterA);
		
		char characterC = 'C';
		System.out.println(characterC);
		
	}
	// double and float difference;
	//float : 32bit.
	//double : 64 bit.
	public void doubleLiterals() {
		//double doubleLiteral = 10.0d; 
		double doubleLiteral = 10.0;
		System.out.println(doubleLiteral);
	}
	
	public void floatLiterals() {
//		float floatLiteral = 10.0;//error: Type mismatch: cannot convert from double to float
		float floatLiteral = 10.0f;
		System.out.println(floatLiteral);
	}
}
