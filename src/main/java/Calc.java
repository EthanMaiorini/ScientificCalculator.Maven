package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calc {
    public static void mainM(String[] args) {

        Scanner input=new Scanner(System.in);

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
            result=firstnumber + secondnumber;
            System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
        }
        else if(sign == '-')
        {
            result=firstnumber-secondnumber;
            System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
        }
        else if(sign == '/'){
            result=firstnumber/secondnumber;
            System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
        }
        else if(sign == '*'){
            result=firstnumber*secondnumber;
            System.out.println(firstnumber +" "+sign +" "+secondnumber +"= "+" "+ result );
        }
        else

            System.out.println("Error, Please check your input");



    }
    public static int add(int firstValue, int secondValue){
        return firstValue + secondValue;
    }

    public static double add(double firstValue, double secondValue){
        return firstValue + secondValue;
    }

    public static int subtract(int firstValue, int secondValue){
        return firstValue - secondValue;
    }

    public static double subtract(double firstValue, double secondValue){
        return firstValue - secondValue;
    }


}

