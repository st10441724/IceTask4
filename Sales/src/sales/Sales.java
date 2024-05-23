/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sales;

/**
 *
 * @author aadim
 */
import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Step 6: Ask user for number of salespeople
        System.out.print("Enter the number of salespeople: ");
        int numberOfSalespeople = scan.nextInt();
        
        int[] sales = new int[numberOfSalespeople];
        int sum = 0;
        int maxSale = Integer.MIN_VALUE;
        int minSale = Integer.MAX_VALUE;
        int maxId = -1;
        int minId = -1;

        // Read sales amounts and calculate sum, max and min sales
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            sum += sales[i];
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxId = i;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minId = i;
            }
        }

        // Print the list of sales, sum, average, max, and min sales
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + (i + 1) + "         " + sales[i]);
        }

        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + (sum / (double) numberOfSalespeople));
        System.out.println("Salesperson " + (maxId + 1) + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + (minId + 1) + " had the lowest sale with $" + minSale);

        // Ask the user for a value and print salespeople exceeding that value
        System.out.print("\nEnter a sales amount to find salespeople who exceeded it: ");
        int threshold = scan.nextInt();
        int countExceeding = 0;

        System.out.println("\nSalespeople exceeding $" + threshold + ":");
        System.out.println("------------------------------");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > threshold) {
                System.out.println("Salesperson " + (i + 1) + " with sales $" + sales[i]);
                countExceeding++;
            }
        }
        System.out.println("Total number of salespeople exceeding $" + threshold + ": " + countExceeding);
    }
}

