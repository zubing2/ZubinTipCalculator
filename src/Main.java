import java.util.Scanner; //Scanner + DecimalFormat import
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Scanner

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are there?"); //Amt of people input
        int groupAmount = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage?"); //Amt of tip input
        int tipAmount = scan.nextInt();
        scan.nextLine();

        double tipPercent = (tipAmount * 0.01); //Converting the whole number input into a decimal, so it can be multiplied into the total later.

        DecimalFormat formatter = new DecimalFormat("#.##"); //Formatter to two decimal spots

        double input = 0; //All the input values starts as zeros and are assigned later.
        double total = 1; //Value of the total has to be 1 instead of 0 since the last input is -1.
        double finalTotal; //Assigned double to each of variable
        double finalTip;
        double finalCostPerPerson;
        double finalTipPerPerson;
        double finalTotalWithTip;

             while (input != -1) { //While loop to ask for price of each item.
                System.out.print("What is the cost of the item? e.g. 10.25 (Type -1 to end): ");
                input = scan.nextDouble();
                total = (total + input); //Adds each input to the total
        }
             //STD=String to Double
        System.out.println("----------------------------");
            String formattedNum = formatter.format(total); //Decimal Formatting for the initial cost
            finalTotal = Double.parseDouble(formattedNum); //STD
            System.out.println("The total cost before tax: " + finalTotal);
            System.out.println("Tip Percentage: " + tipAmount);
            double totalTip = (finalTotal * tipPercent); //Finding tip amt by multiplying total w/ adjusted tip
            String formattedTip = formatter.format(totalTip);
            finalTip = Double.parseDouble(formattedTip); //STD
            System.out.println("Total Tip: " + finalTip);
            double totalWithTip = (finalTotal + finalTip); //Finding tip amt by multiplying total w/ adjusted tip
            String formattedTotalWithTip = formatter.format(totalWithTip);
            finalTotalWithTip = Double.parseDouble(formattedTotalWithTip); //STD
            System.out.println("Total Bill with Tip: " + finalTotalWithTip);
            double costPerPerson = (finalTotal / groupAmount); //Finding cost per person
            String formattedCostPerPerson = formatter.format(costPerPerson);
            finalCostPerPerson = Double.parseDouble(formattedCostPerPerson); //STD
            System.out.println("Cost per person before tip: " + (finalCostPerPerson));
            double tipPerPerson = (finalTip / groupAmount); //Tip per Person
            String formattedTipPerPerson = formatter.format(tipPerPerson);
            finalTipPerPerson = Double.parseDouble(formattedTipPerPerson);//STD
            System.out.println("Tip per person: " + (finalTipPerPerson));
            double finalCostPerPersonWithTip = (finalCostPerPerson + finalTipPerPerson); //Final Cost Per Person w/ Tip
            String formattedFinalCostPerPerson = formatter.format(finalCostPerPersonWithTip);
            finalCostPerPersonWithTip = Double.parseDouble(formattedFinalCostPerPerson);//STD
            System.out.println("Total amount per person: " + (finalCostPerPersonWithTip));
        System.out.print("----------------------------");
    }
}
