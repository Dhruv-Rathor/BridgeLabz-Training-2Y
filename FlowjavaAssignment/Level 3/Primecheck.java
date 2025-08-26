import java.util.Scanner;

class Primecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Prime check is valid only for numbers > 1
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // not prime → break loop
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is Not a Prime Number");
    }
}
