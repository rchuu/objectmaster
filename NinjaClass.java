public class NinjaClass extends HumanClass {
    protected int stealth = 10;

    public void steal(HumanClass hero) { // Ninja: Add a method steal(Human) that takes the amount of stealth the ninja
                                         // has, removes it from the other human's health, and adds it to the ninja's
        hero.health = hero.health - this.stealth;
        this.health = this.health + this.stealth;
    }

    public void runAway() {
        this.health -= 10;
    }
}