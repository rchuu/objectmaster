public class SamuraiClassTest {
    public static void main(String[] args) {
        SamuraiClass naruto = new SamuraiClass();
        SamuraiClass sasuke = new SamuraiClass();
        naruto.deathBlow(sasuke);
        naruto.displayHealth();
        sasuke.displayHealth();
        naruto.meditate();
        naruto.displayHealth();
        sasuke.displayHealth();
        System.out.println("Sasuke's remaining health is " + sasuke.health);
        System.out.println("Naruto's remaining health is " + naruto.health);
    }
}
