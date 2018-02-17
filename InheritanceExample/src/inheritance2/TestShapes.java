package inheritance2;

class GameShape {
	
	public void displayShape() {
		System.out.println("displaying shape");
	}
	
}

//PlayerPiece IS-A GameShape
class PlayerPiece extends GameShape {
	
	public void movePiece() {
		System.out.println("moving game piece");
	}
}

// TilePiece IS-A GameShape
class TilePiece extends GameShape {
	
	public void getAdjacent() {
		System.out.println("getting adjacent tiles");
	}
}

public class TestShapes {
	
	public static void main (String[] args) {
		
		PlayerPiece playerPiece = new PlayerPiece();
		TilePiece tilePiece = new TilePiece();
		doShapes(playerPiece);
		playerPiece.movePiece();
		
		doShapes(tilePiece);
		tilePiece.getAdjacent();
	}
	
	public static void doShapes(GameShape gameShape) {
		gameShape.displayShape();
	}
}