/*
 * Mayowa 
 * Lab 7
 */

import java.util.Random;

public class LottoBall implements Rollable {
    protected int Max;

    public LottoBall(int Max) {
        super();
        this.Max = Max;
    }

    @Override
    public String rollRandom() {
        Random r = new Random();
        return String.valueOf(r.nextInt(Max) + 1);

    }

}
