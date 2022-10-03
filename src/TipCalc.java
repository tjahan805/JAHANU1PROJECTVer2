//scanner is for user input, decimal format is for rounded cents
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalc
{
    public static void main(String[] args)
    {
        //ask user for inputs needed by program
        Scanner money = new Scanner (System.in);
        System.out.print("Enter total bill amount: ");
        double firstTotalBill = money.nextDouble();
        System.out.print("Enter preferred tip percentage: ");
        int tipPercent = money.nextInt();
        System.out.print("Enter number of people at party: ");
        int numofPeople = money.nextInt();

        //declare the outputs needed by user
        double tipAmount = firstTotalBill / ((double) tipPercent);
        double secondTotalBill = firstTotalBill + tipAmount;
        double tipPerPerson = tipAmount / ((double) numofPeople);
        double totalPerPerson = secondTotalBill / ((double) numofPeople);

        //format all the calculated outputs to rounded cents
        DecimalFormat df = new DecimalFormat(".##");

        //User Inputs and Calculated Outputs
        System.out.println();
        System.out.println("Total Bill Before Tip: " + firstTotalBill);
        System.out.println("Tip Percentage: " + tipPercent + "%");
        System.out.println("Number of People: " + numofPeople);
        System.out.println();
        System.out.println("Tip Amount: " + df.format(tipAmount));
        System.out.println("Tip Per Person: " + df.format(tipPerPerson));
        System.out.println("Total Per Person: " + df.format(totalPerPerson));


    }
}