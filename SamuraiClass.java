public class SamuraiClass extends HumanClass {
    protected int health = 200;

    public static int numOfSamurai = 0;

    public SamuraiClass() {
        numOfSamurai++;
    }

    public void deathBlow(HumanClass hero) { // Samurai: Add a method deathBlow(Human) that kills the other human, but
                                             // reduces the Samurai's health by half
        hero.health = 0;
        this.health = this.health / 2;
    }

    public void meditate() { // Samurai: Add a method meditate() that heals the Samurai for half of their
                             // current health.
        this.health = this.health + (this.health / 2);

    }

    public int howMany() {
        return numOfSamurai;
    }
}
