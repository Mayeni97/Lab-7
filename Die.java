/*
 * Mayowa 
 * Lab 7
 */

import java.util.Random;

public class Die implements Rollable {

    @Override
    public String rollRandom() {
        Random r = new Random();
        return String.valueOf(r.nextInt(7) + 1);
    }

}
