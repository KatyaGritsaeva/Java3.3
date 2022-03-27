public class CreditPaymentService {

    public double calculate(double creditsum, double percent, double month) {

        //Входные данные
        double year = 12;
        double percentmounth = percent / 12 / 100;


        double annuity = 1;

        for (int a = 1; a <= month; a++) {

            annuity = annuity * (1 + percentmounth);
        }

        // Логика программы
        // double payment = creditsum * ( percentmounth / (1 + percentmounth) - mounth - 1) ;
        double payment = (percentmounth * annuity) / (annuity - 1);
        //double payment = (percentmounth * (1 + percentmounth)^mounth)
        double paymentmounth = payment * creditsum;
        return paymentmounth;
    }

}

