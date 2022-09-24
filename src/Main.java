import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people are there?");
        int groupAmount = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage?");
        int tipAmount = scan.nextInt();
        scan.nextLine();

        double tipPercent = (tipAmount * 0.01);

        DecimalFormat formatter = new DecimalFormat("#.00");


        double input = 0;
        double total = 0;

        double finalTotal = 0;
        double finalTip = 0;
        double num = 0;
        double num2 = 0;
        while (input != -1) {
            System.out.print("What is the cost of the item? (dollars and cents) (Type -1 to end): ");
            input = scan.nextDouble();
            total = (total + input);
            num = total;


        }
        total++;
        System.out.println("--------------------------");
        String formattedNum = formatter.format(num);
        finalTotal = Double.parseDouble(formattedNum);
        System.out.println("The total cost before tax: " + finalTotal);
        System.out.println("Tip Percentage: " + tipAmount);
        double totalTip = (finalTotal * tipPercent);
        num2 = totalTip;
        String formattedTip = formatter.format(num2);
        finalTip = Double.parseDouble(formattedTip);
        System.out.println("Total Tip: " + finalTip);
        System.out.println("Total Bill with Tip: " + (total + totalTip));
        System.out.println("Cost per person before tip: " + (total / groupAmount));
        System.out.println("Tip per person: " + (totalTip / groupAmount));
        System.out.println("Total amount per person: " + ((total + totalTip) / groupAmount));
    }
}
