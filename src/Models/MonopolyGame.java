package Models;
import java.util.ArrayList;

public class MonopolyGame {
    private int maxRound;
    private int roundCount;
    private Board board;
    private ArrayList<Die> dice;
    private ArrayList<Player> players;

    public MonopolyGame(int maxRound, Board board, ArrayList<Die> dice, ArrayList<Player> players) {
        this.maxRound = maxRound;
        this.roundCount = 0;
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
        while (roundCount < 5) {
            System.out.println("=========================== Round " + roundCount + " ===========================");
            System.out.println();

            playRound();
            roundCount ++;
        }
    }
}
