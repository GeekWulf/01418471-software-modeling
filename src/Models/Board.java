package Models;
import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public Square getSquare(Square oldLocation, int totalFaceValue) {
        return squares.get(oldLocation.getName() + totalFaceValue);
    }
}
