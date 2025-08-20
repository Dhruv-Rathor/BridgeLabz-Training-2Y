public class profitloss {
    public static void main(String[] args) {
        int costprice = 129;
        int sellingprice = 191;

        int profit = sellingprice - costprice;
        double profitpercentage = (profit / (double) costprice) * 100;

        System.out.println("the cost price is inr " + costprice + " and selling price is inr " + sellingprice + 
                           "\nthe profit is inr " + profit + " and the profit percentage is " + profitpercentage);
    }
}
