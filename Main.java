public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
//        double creditsum = 1_000_000;
//        double percent = 9.99;
//        double month = 36;
        double result12month = service.calculate(1_000_000, 9.99, 12);
        int result12 = (int) result12month;
        System.out.println("Если срок кредита 12 месяцев, то ежемесячный платеж = " + result12);

        double result24month = service.calculate(1_000_000, 9.99, 24);
        int result24 = (int) result24month;
        System.out.println("Если срок кредита 24 месяца, то ежемесячный платеж = " + result24);

        double result36month = service.calculate(1_000_000, 9.99, 36);
        int result36 = (int) result36month;
        System.out.println("Если срок кредита 36 месяцев, то ежемесячный платеж = " + result36);

    }
}