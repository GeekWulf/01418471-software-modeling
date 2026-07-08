import Models.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();

        // create 2 dice
        ArrayList<Die> dice = new ArrayList<>();
        dice.add(new Die());
        dice.add(new Die());

        // create 2 player
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("player 1", dice, board));
        players.add(new Player("player 2", dice, board));

        MonopolyGame monopolyGame = new MonopolyGame(5, board, dice, players);
        monopolyGame.playGame();
    }
}