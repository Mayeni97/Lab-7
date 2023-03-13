/*
 * Mayowa 
 * Lab 7
 */

import java.util.Random;

public class StepperWheel extends Wheel {

    String[] Symbol = { "Cherry", "Apple", "Pinaples", "Grape", "Oranges", "Peaches",
            "Cherry", "Apple", "Pinaples", "Grape", "Oranges", "Peaches",
            "Cherry", "Apple", "Pinaples", "Grape", "Oranges", "Peaches" };

    public StepperWheel(int wheel) {
        super(wheel);
    }

    @Override
    public String rollRandom() {
        Random r = new Random();
        return String.valueOf(Symbol[r.nextInt(Symbol.length)]);
    }
}
