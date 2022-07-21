public class WizardClass extends HumanClass {
    protected int health = 50;
    protected int intelligence = 8;

    public void heal(HumanClass hero) {
        hero.health = hero.health + this.intelligence;
    }

    public void fireBall(HumanClass hero) {
        hero.health = hero.health - this.intelligence * 3;
    }
}
