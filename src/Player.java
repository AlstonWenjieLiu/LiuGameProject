public class Player {
    private String name;
    private int gold;
    private Sword sword;
    private int numberOfActions;
    private double totalDamage;


    public Player(String name) {
        this.name = name;
        gold = 0;
        int str = (int) (Math.random() * 10) + 10;
        sword = new Sword(str);
        numberOfActions = 0;
        totalDamage = 0;
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

    public int getStrength() {
        return sword.getStrength();
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

    public double getScore() {
        return totalDamage + gold - numberOfActions;
    }

    public void addStrength(int amount) {
        sword.addStrength(amount);
    }

    public void addGold(int goldToAdd) {
        gold += goldToAdd;
    }

    public void addTotalDamage(double amount) {
        totalDamage += amount;
    }


}
