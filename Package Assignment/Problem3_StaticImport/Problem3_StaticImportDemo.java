import static java.lang.Math.*;

public class Problem3_StaticImportDemo {
    public static void main(String[] args) {
        double val1 = 9.0;
        double val2 = 4.0;

        System.out.println("sqrt(9.0) = " + sqrt(val1));
        System.out.println("pow(9.0, 2.0) = " + pow(val1, 2.0));
        System.out.println("max(9.0, 4.0) = " + max(val1, val2));
        System.out.println("min(9.0, 4.0) = " + min(val1, val2));
        System.out.println("abs(-10.5) = " + abs(-10.5));
    }
}
