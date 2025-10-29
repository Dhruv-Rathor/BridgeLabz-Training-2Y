import static java.lang.Math.pow;

class InterestCalculator {
    public double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100.0;
    }

    public double calculateCompoundInterest(double p, double r, double t) {
        return p * (pow((1 + r / 100), t)) - p;
    }
}

public class Problem8_BankingSystem {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();
        double principal = 1000;
        double rate = 5;
        double time = 2;

        double si = calc.calculateSimpleInterest(principal, rate, time);
        double ci = calc.calculateCompoundInterest(principal, rate, time);

        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.printf("Simple Interest: %.2f\n", si);
        System.out.printf("Compound Interest: %.2f\n", ci);
    }
}
