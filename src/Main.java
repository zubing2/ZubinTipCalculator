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

        while (input != -1) {
            System.out.print("What is the cost of the item? (dollars and cents) (Type -1 to end): ");
            input = scan.nextDouble();
            total = (total + input);
            double num = total;
            String formattedNum = formatter.format(num);
        }
        double formattedNum = total;
        total++;
        System.out.println("--------------------------");
        System.out.println("The total cost before tax: " + formattedNum);
        System.out.println("Tip Percentage: " + tipAmount);
        double totalTip = (total * tipPercent);
        System.out.println("Total Tip: " + totalTip);
        System.out.println("Total Bill with Tip: " + (total+totalTip));
        System.out.println("Cost per person before tip: " + (total/groupAmount));
        System.out.println("Tip per person: " +  (totalTip/groupAmount));
        System.out.println("Total amount per person: " + ((total+totalTip)/groupAmount));
    }
}
