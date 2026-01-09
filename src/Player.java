public class Player {
    private String name;
    private int gold;
    private Sword sword;

    public Player(String name) {
        this.name = name;
        gold = 0;
        int str = (int) (Math.random() * 10) + 10;
        sword = new Sword(str);
    }

    // getters
    public String getName() {
        return name;
    }

    public int getGold() {
        return gold;
    }

    public Sword getSword() {
        return sword;
    }

    // public methods
    public int attack(Enemy enemyToAttach) {
        int attackAmount = (int) (Math.random() * 20) + 1;
        sword.swing();
        if (sword.getStrength() > 0) {
            System.out.println("Sword adds " + sword.getStrength() + " damage!");
        }
        attackAmount += sword.getStrength();
        enemyToAttach.takeDamage(attackAmount);
        return attackAmount;
    }

    public void addGold(int goldToAdd) {
        gold += goldToAdd;
    }
}
