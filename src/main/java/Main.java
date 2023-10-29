public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 0;
        boolean registered = true;
        long expected = 0;
        long outcome = service.calculate(amount, registered);
        System.out.println(outcome);
    }
}
