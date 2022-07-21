public class HumanClass {
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;

    public int attack(HumanClass hero) { // this is a method
        return hero.health = hero.health - this.strength;
    }

    public int read(HumanClass hero) {
        return hero.health = hero.health + this.intelligence;
    }

    public void displayHealth() {
        System.out.println(health);
    }
}