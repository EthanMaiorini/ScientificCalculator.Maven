package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a function : ");
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }
}
   /* Scanner input=new Scanner(System.in);

    int firstnumber,secondnumber,result;

//Assign character variable + - * /

        System.out.print("Enter your first number : ");

                //input any number from user //
                firstnumber=input.nextInt();

                System.out.print("Enter the second number : ");

                //input any number from user//
                secondnumber=input.nextInt();

                //Ask the user to enter operator to be used
                System.out.print("Choose an operator: ");

                //input is received from user//
                char sign = input.next().charAt(0);

                if (sign == '+' ){
                result= Calc.add(firstnumber,secondnumber);
                System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
                }
                else if(sign == '-')
                {
                result= Calc.subtract(firstnumber,secondnumber);
                System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
                }
                else if(sign == '/'){
                result= Calc.divide(firstnumber,secondnumber);
                System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
                }
                else if(sign == '*'){
                result=Calc.multiply(firstnumber,secondnumber);
                System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
                }
                else

                System.out.println("Error, Please check your input");



                }*/
