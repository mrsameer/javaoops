/*
A mail-order house sells five products whose retail prices are as follows : Product 1 : Rs. 99.90
, Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50 and Product 5 : Rs. 40.49 .
Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an
application that reads a series of pairs of numbers as follows :
a) product Id
b) quantity sold your program use a switch statement to determine the retail price for each
product. it should calculate and display the total retail value of all products sold.
 */
package labmanual.week3;

import java.util.Scanner;

public class Totretailval {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double totalRetail = 0;
        int option;
        int quantity;

        // use a sentinal-controlled loop to determine when the
        // program should stop looping and display the final results.
        while (true) {
            // display menu
            System.out.println("1- Product 1 : Rs. 99.90");
            System.out.println("2- Product 2 : Rs. 20.20");
            System.out.println("3- Product 3 : Rs. 6.87");
            System.out.println("4- Product 4 : Rs. 45.50");
            System.out.println("5- Product 5 : Rs. 40.49");
            System.out.println("6- Exit program");
            System.out.print("Please select an option from above: ");
            option = sc.nextInt();

            if (option >= 6 || option < 1) // as valid range is 1 to 5 for products and 6 is for exit
                break;
            System.out.print("Enter quantity sold: ");
            quantity = sc.nextInt();
            switch (option) {
                case 1:
                    totalRetail += 99.90 * quantity;
                    break;
                case 2:
                    totalRetail += 20.20 * quantity;
                    break;
                case 3:
                    totalRetail += 6.87 * quantity;
                    break;
                case 4:
                    totalRetail += 45.50 * quantity;
                    break;
                case 5:
                    totalRetail += 40.49 * quantity;
                    break;
            }
        }
        // display
        System.out.println("The total retail value of all products sold: Rs. " + totalRetail);
    }
}
