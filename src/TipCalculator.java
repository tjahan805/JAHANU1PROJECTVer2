public class TipCalculator
{
    //set user input variables
    private int numOfPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    //ask user for num of people and tip percent
    public TipCalculator(int ppl, int tipPercent) {
        numOfPeople = ppl;
        tipPercentage = tipPercent;
        totalBillBeforeTip = 0.00;
    }

    //getter methods
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public int getTipPercentage() {
        return tipPercentage;
    }

    //ask for cost of each addition to meal
    public void addMeal(double cost) {
        totalBillBeforeTip+=cost;
    }

    //make method for tipamt, bill after tip and bill and tip per person
    public double tipAmount() {
        double tipAmount = getTotalBillBeforeTip() * (getTipPercentage()*.01);
        return tipAmount;
    }

    public double totalBill() {
        double totalBill = getTotalBillBeforeTip() + tipAmount();
        return totalBill;
    }

    public double totalBillBeforeTipPerPerson() {
        double totalBillBeforeTipPerPerson = getTotalBillBeforeTip()/ ((double) numOfPeople);
        return totalBillBeforeTipPerPerson;
    }

    public double tipPerPerson() {
        double tipPerPerson = tipAmount()/numOfPeople;
        return tipPerPerson;
    }

    public double totalPerPerson() {
        double totalPerPerson = totalBill()/numOfPeople;
        return totalPerPerson;
    }
}