
import java.text.DecimalFormat;
import java.util.Scanner;
//^^this is for user input and formatting for money
public class TipCalculatorRunner {

    public static void main(String[] args) {
        System.out.println("Welcome to the tip calculator!");

        //ask user for inputs needed by program
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your party? ");
        int numOfPeople = scan.nextInt();
        System.out.print("Enter preferred tip percentage? (0-100) ");
        int tipPercentage = scan.nextInt();

        //input the user inputs to calc object
        TipCalculator party1 = new TipCalculator(numOfPeople, tipPercentage);

        //enter cost per addition to bill
        double mealPrice = 0;
        while (mealPrice != -1) {
            System.out.print("Enter a cost: (-1 if done) ");
            mealPrice = scan.nextDouble();
            if (mealPrice != -1) {
                party1.addMeal(mealPrice);
            }
        }

        DecimalFormat df = new DecimalFormat(".##");

        //final calculations
        System.out.println("------------------------------");
        System.out.println("Number of People: " + numOfPeople + " people");
        System.out.println("Total Bill Before Tip: $" + party1.getTotalBillBeforeTip());
        System.out.println("Total Per Person Before Tip: $" + df.format(party1.totalBillBeforeTipPerPerson()));
        System.out.println("Tip Percentage: " + tipPercentage + "%");
        System.out.println("Tip: $" + df.format(party1.tipAmount()));
        System.out.println("Total Bill After Tip: $" + df.format(party1.totalBill()));
        System.out.println("Tip Per Person: $" + df.format(party1.tipPerPerson()));
        System.out.println("Total Per Person: $" + df.format(party1.totalPerPerson()));

    }

}
