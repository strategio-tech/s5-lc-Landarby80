package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     *  This method calculates the remaining amount after 3 months.
     *
     * 
     * @param  amount is how much money your friend gave to you.
     * @return  the remaining amount after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        // TODO: Add your code below

        for (int x=1; x<=3; x++){
            amount = amount - ((amount*10)/100);
        }

        return amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        System.out.println(getRemainingAmountIn3Months(amount));
    }
}
