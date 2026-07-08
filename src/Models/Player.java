package Models;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Die> dice;
    private Board board;
    private Piece piece;

    public Player(String name, ArrayList<Die> dice, Board board) {
        this.name = name;
        this.dice = dice;
        this.board = board;
        this.piece = new Piece(board.getOriginSquare());
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

        System.out.println("----------------------------------");
        System.out.println("Player " + name + "'s turn");
        System.out.println("----------------------------------");

        for (Die d : dice) {
            d.roll();
            totalFaceValue += d.getFaceValue();

            System.out.println("     " + name + " rolled a " + d.getFaceValue());
        }

        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, totalFaceValue);
        piece.setLocation(newLocation);

        System.out.println("     Current " + name + " Location: " + newLocation.getName());
        System.out.println();
    }
}
