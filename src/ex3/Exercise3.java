package ex3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radius = 0;

        double area = 0;

        System.out.println("Enter the radius: ");
        radius = in.nextDouble();

        if(radius < 0) {
            System.out.println("Error - negative radius!");
            System.exit(1);
        }

        area = Math.PI *(radius * radius);

        System.out.printf("The area is: %.2f", area);
    }
}
