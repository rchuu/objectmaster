public class WizardClass extends HumanClass {
    protected int health = 50;
    protected int intelligence = 8;

    public int heal(HumanClass hero) {
        return hero.health = hero.health + this.intelligence;
    }

    public int fireball(HumanClass hero) {
        return hero.health = hero.health - this.intelligence * 3;
    }
}
