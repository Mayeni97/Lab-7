/*
 * Mayowa 
 * Lab 7
 */

abstract class Wheel implements Rollable {
    protected int wheelSize;

    /**
     * Sets the wheel to use. Default is 0 which means no wheel is used
     * 
     * @param wheel - The wheel to use
     */
    public void setwheel(int wheel) {
        this.wheelSize = wheel;
    }

    /**
     * Returns the wheel value.
     */
    public int getwheel() {
        return wheelSize;
    }

    public Wheel(int wheelSize) {
        super();
        this.wheelSize = wheelSize;
    }

}
