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

        DecimalFormat formatter = new DecimalFormat("#.##");


        double input = 0;
        double total = 0;

        while (input != -1) {
            System.out.print("What is the cost of the item? (dollars and cents) (Type -1 to end): ");
            input = scan.nextDouble();
            double num = input;
            String formattedNum = formatter.format(num);
            total = (total + formattedNum);
        }
        double num = input;

        total ++;
        System.out.println("The total cost before tax: " + total);
        System.out.println("Tip Percentage: " + tipAmount);
    }
}
