package inheritance;


class GameShape {
	
	public void displayShape() {
		System.out.println("displaying shape");
	}
}

// PlayerPice IS-A GameShape
class PlayerPiece extends GameShape {
	
	public void movePiece() {
		System.out.println("moving game piece");
	}

}

public class TestShapes {
	
		public static void main (String[] args) {
			PlayerPiece shape = new PlayerPiece();
			shape.displayShape();
			shape.movePiece();
		}
}
