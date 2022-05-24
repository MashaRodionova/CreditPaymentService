public class CreditPaymentService {
    //за основу берем формулу A = K * S, где А – сумма ежемесячного аннуитетного платежа, К - коэффициент аннуитета
    // К = i*(1+i)^n/((1+i)^n-1), где i - месячсная процентная ставка, n - количество периодов, в течение которых выплачивается кредит
    public double calculate(int creditAmount, int creditPeriod, double creditRate) {
        // рассчитываем месячную ставку
        double monthlyRate = creditRate / 12 / 100;
        // рассчитываем выражение (1+i)^n
        double exponentiation = Math.pow((1 + monthlyRate), creditPeriod);
        // рассчитываем аннуитентный коэф К
        double coefficient = monthlyRate * exponentiation / (exponentiation - 1);
        // рассчитываем ежемесячный платеж
        double monthlyPayment = creditAmount * coefficient;
        return monthlyPayment;
    }

}
