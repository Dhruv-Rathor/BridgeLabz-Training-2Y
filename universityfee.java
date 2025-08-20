public class universityfee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountpercent = 10;

        double discount = (fee * discountpercent) / 100.0;
        double finalfee = fee - discount;

        System.out.println("the discount amount is inr " + discount + " and final discounted fee is inr " + finalfee);
    }
}
