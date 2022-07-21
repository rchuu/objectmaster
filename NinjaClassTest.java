public class NinjaClassTest {
    public static void main(String[] args) {
        NinjaClass todd = new NinjaClass();
        NinjaClass jim = new NinjaClass();
        todd.steal(jim);
        todd.steal(jim);
        todd.runAway();
        System.out.println("Todd's remaining health is " + todd.health);
        System.out.println("Jim's remaining health is " + jim.health);
    }
}
