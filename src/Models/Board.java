package Models;
import java.util.ArrayList;

public class Board {
    private ArrayList<Square> squares;

    public Board() {
        this.squares = new ArrayList<>();

        for (int i = 0; i < 40; i++) {
            squares.add(new Square(i));
        }
    }

    public Square getSquare(Square oldLocation, int totalFaceValue) {
        return squares.get(oldLocation.getName() + totalFaceValue);
    }

    public Square getOriginSquare() {
        return squares.get(0);
    }
}
