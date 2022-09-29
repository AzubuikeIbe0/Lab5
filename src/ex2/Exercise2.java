package ex2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String user_Input;

        System.out.println("Enter a logical Operator ");
        user_Input = in.nextLine();

        if(user_Input.equals("&&") ) {
            System.out.println("AND");
        }else if( user_Input.equals( "||") ){
            System.out.println("OR");
        }else if( user_Input.equals( "!") ) {
            System.out.println("NOT");
        }else {
            System.out.println("Error: Not a logical Operator");
            System.exit(1);
        }
    }
}
