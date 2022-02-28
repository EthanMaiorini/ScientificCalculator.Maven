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
        System.out.println("");
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner input=new Scanner(System.in);

        int firstNumber;

//Assign character variable + - * /

        System.out.print("Enter a number : ");

        //input any number from user //
        firstNumber=input.nextInt();
        return firstNumber;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner input=new Scanner(System.in);

        double firstNumber;

//Assign character variable + - * /

        System.out.print("Enter a number : ");

        //input any number from user //
        firstNumber=input.nextDouble();

        return firstNumber;

    }
    public static void switchDisplay(double resultD) {
        System.out.println("Change Units?(Radians,Degrees,exit");
        String sign = getStringInput("Change Units?(Radians,Degrees,exit");
        while (!(sign.toLowerCase().equals("exit"))) {

            if (sign.equals("\n")) {
                SciCal.switchDisplayMode(resultD);
            } else
                SciCal.switchUnitsMode(sign, resultD);
            System.out.println("");
            sign = getStringInput("Change Units?(Radians,Degrees,exit");
        }
    }
/*
public static void main(){
        int result =0;
        double resultD = 0;
        getStringInput();
    char sign = input.next().charAt(0);

                if (sign == '+' ){

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


}
