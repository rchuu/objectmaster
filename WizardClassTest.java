public class WizardClassTest {
    public static void main(String[] args) {

        WizardClass fred = new WizardClass();
        WizardClass james = new WizardClass();

        fred.fireBall(james);
        fred.fireBall(james);
        fred.fireBall(james);
        fred.fireBall(james);
        james.displayHealth();
        fred.heal(james);
        james.displayHealth();
    }
}
