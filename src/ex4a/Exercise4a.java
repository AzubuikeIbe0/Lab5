package ex4a;

import java.util.Scanner;

public class Exercise4a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int amount = 0;
        double amount_converted = 0;

        System.out.println("Enter the coinage amount: ");
        amount = in.nextInt();

        //if(amount != 1 && amount != 2 && amount != 5 && amount != 10 && amount != 20 && amount != 50)
           // System.out.println("Invalid coinage amonunt!");

        switch (amount) {
            case 1:
              amount_converted = 1.27 * 1;
              System.out.println("1p = " + amount_converted + " cents");
              break;

            case 2:
                amount_converted = 1.27 * 2;
                System.out.println("2p = " + amount_converted + " cents");
                break;

            case 5:
                amount_converted = 1.27 * 5;
                System.out.println("5p = " + amount_converted + " cents");
                break;

            case 10:
                amount_converted = 1.27 * 10;
                System.out.println("10p = " + amount_converted + " cents");
                break;

            case 20:
                amount_converted = 1.27 * 20;
                System.out.println("20p = " + amount_converted + " cents");
                break;

            case 50:
                amount_converted = 1.27 * 50;
                System.out.println("50p = " + amount_converted + " cents");
                break;

            default:
                System.out.println("Invalid coinage amount!");
                break;
        }


    }
}
