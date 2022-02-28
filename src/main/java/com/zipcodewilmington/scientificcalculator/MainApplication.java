package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        double resultD =0.0;
        Console.println("Welcome to my calculator!");

        Console.println("List of Functions: +,-,*,/,Square root,Square,power,inverse,-/+, M+,MC,MRC");
        Console.println("Sine,Cosine,Tangent,Asine,Acosine,Atangent,LOG,10^x,Ln,e^x,!,exit");
        resultD = Console.getDoubleInput("Enter an Integer");
        String sign = Console.getStringInput("Enter a string");
        //int result = 0;
        while (!(sign.toLowerCase().equals("exit"))) {

            if(sign.equals("M+")){
                SciCal.addToMemory(resultD);
            } else if (sign.equals("MC")){
                SciCal.resetMemory();
            }

            else if (sign.equals("+")) {
                double i2= Console.getDoubleInput("Enter an Integer");
                resultD = Calc.add(resultD, i2);

                System.out.println( resultD);
            } else if (sign.equals("-")) {

                double i2 = Console.getDoubleInput("Enter an Integer");
                resultD = Calc.subtract(resultD, i2);

                System.out.println( resultD);
            } else if (sign.equals("/")) {
                double i2 = Console.getDoubleInput("Enter an Integer");
                while (i2 == 0.0) {
                    System.out.println("Error, Please check your input");
                    i2 = Console.getDoubleInput("Enter an Integer");
                }
                resultD = Calc.divide(resultD, i2);

                System.out.println(resultD);
            } else if (sign.equals("*")) {

                double i2 = Console.getDoubleInput("Enter an Integer");
                resultD = Calc.multiply(resultD, i2);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("square root")) {
                resultD = Calc.squareRt(resultD);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("square")) {

                resultD = Calc.square(resultD);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("power")) {

                double i2 = Console.getDoubleInput("Enter an Integer");
                resultD = Calc.power(resultD, i2);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("inverse")) {

                resultD = Calc.inverse(resultD);

                System.out.println(resultD);
            } else if (sign.equals("-/+")) {

                resultD = Calc.changeSign(resultD);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("sine")) {

                resultD = SciCal.sine(resultD);

                System.out.println(resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("cosine")) {
                resultD = SciCal.cosine(resultD);

                System.out.println(resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("tangent")) {

                resultD = SciCal.tangent(resultD);

                System.out.println(resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("asine")) {

                resultD = SciCal.invSine(resultD);

                System.out.println(resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("acosine")) {

                resultD = SciCal.invCosine(resultD);

                System.out.println(resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("atan")) {

                resultD = SciCal.invTan(resultD);

                System.out.println(resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("log")) {

                resultD = SciCal.log(resultD);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("10^x")) {

                resultD = SciCal.invLog(resultD);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("Ln")) {

                resultD = SciCal.natlog(resultD);

                System.out.println(resultD);
            } else if (sign.toLowerCase().equals("e^x")) {

                resultD = SciCal.invNatlog(resultD);

                System.out.println(resultD);
            } else if (sign.equals("!")) {

               resultD = SciCal.factorial((int)resultD);

                System.out.println(resultD);
            }else if (sign.toLowerCase().equals("SwitchDisplay")) {
                System.out.println("Hexadecimal, Binary, Octal, Decimal");
                sign = Console.getStringInput("Enter a string");
                SciCal.switchDisplayMode(sign, resultD);

                //System.out.println(resultD);
            }

            else
                System.out.println("Error, Please check your input");

            System.out.println("");
            sign = Console.getStringInput("Enter a string");
        }

    }

}

