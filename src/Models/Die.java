package Models;
import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        faceValue = 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        Random rand = new Random();
        this.faceValue = rand.nextInt(1,6);
    }
}
