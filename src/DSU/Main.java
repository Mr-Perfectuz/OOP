package DSU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Double monthlyinterestRate, loanAmount, numberOfYears, monthlyPayment, totalPayment, x, y;

        System.out.println("Enter the interest rate: ");
        monthlyinterestRate = scanner.nextDouble();

        System.out.println("Enter the number of years : ");
        numberOfYears = scanner.nextDouble();

        System.out.println("Enter the loan amount: ");
        loanAmount = scanner.nextDouble();


        monthlyinterestRate = (double) (monthlyinterestRate * 100)/100;
        monthlyinterestRate = monthlyinterestRate/12;


        x = ((loanAmount * monthlyinterestRate));
        y = (1-(1/ Math.pow(1+monthlyinterestRate, numberOfYears*12)));

        monthlyPayment = x/y;

        totalPayment =  (monthlyPayment * numberOfYears * 12);

        System.out.println(" The monthly payment is "+ monthlyPayment);
        System.out.println(" The total payment is "+ totalPayment);










//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(" Enter the purchase amount: ");
//        double purchaseAmount = scanner.nextDouble();
//
//        double tax = purchaseAmount * 0.06;
//
//        System.out.println(" Sales tax is " + (int)(tax * 100)/100.0);














//
//        int i =1;
//        byte b = (byte) i;
////        double n = 1.7;
//        System.out.println((double) 1/(double) 2);
//        System.out.println((int) 1.7);


    }
}
