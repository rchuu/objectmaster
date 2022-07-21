public class HumanClassTest {
    public static void main(String[] args) {
        HumanClass bob = new HumanClass();
        HumanClass joe = new HumanClass();
        bob.attack(joe);
        joe.displayHealth();
        bob.read(bob);
        bob.displayHealth();
    }
}
