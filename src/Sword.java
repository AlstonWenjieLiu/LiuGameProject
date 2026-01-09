public class Sword {
    private int strength;

    public Sword(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void swing() {
        strength -= 1;
        if (strength < 0) {
            strength = 0;
        }
    }
}
