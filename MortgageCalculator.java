
package mortgage_calculator;

import java.util.Scanner;
class MortgageCalculator {
    public static void main(String[] args) {
        final byte percent = 100;
        final byte monthsInYear = 12;
        double principal = 0;
        double annualInterestRate = 0;

        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        if(principal>1000 && principal<=1_000_000)
            break;
        else
            System.out.println("Enter the amount that is between 1000 and 1,000,000,000 Frw");
        }
        
        while (true) {
        System.out.print("Enter the annual interest rate (in percentage): ");
        annualInterestRate = scanner.nextDouble();
        if(annualInterestRate > 1.0 && annualInterestRate <= 100){
            break;
        }
        else{
            System.out.println("Enter the monthly interest rate between 1 and 100 (in percentage): ");
        }
    }

        while (true){       
        System.out.print("Enter the number of years: ");
        years = scanner.nextByte();
        if(years >= 1 && years <= 50){
            break;
        }
        else{
            System.out.println("Enter the number of years between 1 and 50: ");
        }
        }
        double monthlyInterestRate = annualInterestRate / (percent * monthsInYear);
        double monthlyPayment = principal * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -monthsInYear * years));

        System.out.printf("Monthly payment: $%.2f%n", monthlyPayment);
        scanner.close();
    }
}