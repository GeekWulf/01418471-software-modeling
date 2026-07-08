package Models;
import java.util.ArrayList;

public class MonopolyGame {
    private int roundCount;
    private Board board;
    private ArrayList<Die> dice;
    private ArrayList<Player> players;

    public MonopolyGame(int roundCount, Board board, ArrayList<Die> dice, ArrayList<Player> players) {
        this.roundCount = roundCount;
        this.board = board;
        this.dice = dice;
        this.players = players;
    }

    private void playRound() {
        for (Player p : players) {
            p.takeTurn();
        }
    }

    public void playGame() {
        while (roundCount < 40) {
            playRound();
        }
    }
}
