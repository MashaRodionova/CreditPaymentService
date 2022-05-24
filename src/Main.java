public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double mP = service.calculate(1000000, 12, 9.99);
        int result = (int) Math.round(mP);
        System.out.println("Ежемесячный платеж составляет " + result + " руб.");

    }

}