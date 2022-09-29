package ex1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double BASIC_HOURLY_WAGE = 7.25;
        final  double OVERTIME_WAGE = 10.875;
        final int BASIC_HOURS = 40;

        final double    SALES_COMM_PERC = 0.05;

        int hours_Worked = 0;

        double sales_Total = 0;

        double sales_comm = 0;

        double wage = 0;

        System.out.println("Enter hours worked ");
        hours_Worked = in.nextInt();

        System.out.println("Enter total sales ");
        sales_Total = in.nextDouble();

        if(hours_Worked > 40 ) {
            if(sales_Total > 50) {
                sales_comm = sales_Total * SALES_COMM_PERC;
            }else{
                sales_comm = 0;
            }
            wage = sales_comm + (BASIC_HOURS * BASIC_HOURLY_WAGE) + ((hours_Worked - BASIC_HOURS) * OVERTIME_WAGE) ;
        } else {
            wage = sales_comm + (BASIC_HOURS * BASIC_HOURLY_WAGE)  ;

        }

        System.out.println("Number of Hours Worked " + hours_Worked);
        System.out.printf("Total Sales € %.2f\n", sales_Total);
        System.out.printf("Wage € %.2f\n", wage);

    }
}
