
//Starting Program
import java.util.Scanner;

public class TaxCalculator {

    // Method to calculate tax based on income
    public static double calculateTax(double income) {
        double taxRate;
        if (income < 500) {
            taxRate = 0.10; // 10% tax rate
        } else if (income < 1500) {
            taxRate = 0.15; // 15% tax rate
        } else if (income < 2500) {
            taxRate = 0.20; // 20% tax rate
        } else {
            taxRate = 0.30; // 30% tax rate
        }
        // tax based on the income and tax rate
        return income * taxRate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Message to the user
        System.out.println(" Hello there! Ready to crunch some numbers and find out your average weekly tax withholding?");

        // Initialize variable to hold the total tax amount
        double totalTax = 0;
        // Prompt the user to enter the number of weeks of income
        System.out.print("First things first, how many weeks of income are we looking at? ");
        int numWeeks = scanner.nextInt();

        // Loop through each week to gather income data and calculate the tax
        for (int week = 1; week <= numWeeks; week++) {
            // Prompt the user to enter the income for the current week
            System.out.print("Awesome! Please enter your income for week " + week + ": ");
            double income = scanner.nextDouble();
            double tax = calculateTax(income);
            totalTax += tax;
            System.out.println("For week " + week + ": Your income was $" + String.format("%.2f", income) + ", and the tax is $" + String.format("%.2f", tax) + ". Keep up the good work!");
        }

        // Calculate the average tax by dividing the total tax by the number of weeks
        double averageTax = totalTax / numWeeks;
        // Display a summary message with the average weekly tax withholding
        System.out.println("\nGreat job! Let's see what we've got here...");
        System.out.println("Your average weekly tax withholding is: $" + String.format("%.2f", averageTax) + ".");
        System.out.println("Thanks for using the Tax Calculator!");

        //End Program
        scanner.close();
    }
}
