package Models;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Die> dice;
    private Board board;
    private Piece piece;

    public Player(String name, ArrayList<Die> dice, Piece piece) {
        this.name = name;
        this.dice = dice;
        this.piece = piece;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Die> getDice() {
        return dice;
    }

    public Piece getBoard() {
        return piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void takeTurn() {
        int totalFaceValue = 0;

        for (Die d : dice) {
            totalFaceValue += d.getFaceValue();
            d.roll();
        }

        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, totalFaceValue);
        piece.setLocation(newLocation);
    }
}
