package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.println("List of Functions: +,-,*,/,Square root,Square,power,inverse,-/+");
        Console.println("Sine,Cosine,Tangent,Asine,Acosine,Atangent,LOG,10^x,Ln,e^x,!,exit");
        String sign = Console.getStringInput("Enter a string");
        while (!(sign.toLowerCase().equals("exit"))) {
            // Integer i = Console.getIntegerInput("Enter an integer");
            // Double d = Console.getDoubleInput("Enter a double.");

            // Console.println("The user input %s as a string", s);
            //Console.println("The user input %s as a integer", i);
            // Console.println("The user input %s as a d", d);

            int result = 0;
            double resultD = 0;


            if (sign.equals("+")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                Integer i2 = Console.getIntegerInput("Enter an Integer");
                result = Calc.add(i, i2);

                System.out.println(i + " " + sign + " " + i2 + "= " + " " + result);
            } else if (sign.equals("-")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                Integer i2 = Console.getIntegerInput("Enter an Integer");
                result = Calc.subtract(i, i2);

                System.out.println(i + " " + sign + " " + i2 + "= " + " " + result);
            } else if (sign.equals("/")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                Integer i2 = Console.getIntegerInput("Enter an Integer");
                while (i2 == 0) {
                    System.out.println("Error, Please check your input");
                    i2 = Console.getIntegerInput("Enter an Integer");
                }
                resultD = Calc.divide(i, i2);

                System.out.println(i + " " + sign + " " + i2 + "= " + " " + resultD);
            } else if (sign.equals("*")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                Integer i2 = Console.getIntegerInput("Enter an Integer");
                result = Calc.multiply(i, i2);

                System.out.println(i + " " + sign + " " + i2 + "= " + " " + result);
            } else if (sign.toLowerCase().equals("square root")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                resultD = Calc.squareRt(i);

                System.out.println(i + " " + sign + "= " + " " + resultD);
            } else if (sign.toLowerCase().equals("square")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                result = Calc.square(i);

                System.out.println(i + " " + sign + "= " + " " + result);
            } else if (sign.toLowerCase().equals("power")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                Integer i2 = Console.getIntegerInput("Enter an Integer");
                resultD = Calc.power(i, i2);

                System.out.println(i + " " + sign + " " + i2 + "= " + " " + resultD);
            } else if (sign.toLowerCase().equals("inverse")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                resultD = Calc.inverse(i);

                System.out.println(i + " " + sign + "= " + " " + resultD);
            } else if (sign.equals("-/+")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                result = Calc.changeSign(i);

                System.out.println(i + " " + sign + "= " + " " + resultD);
            } else if (sign.toLowerCase().equals("sine")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.sine(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("cosine")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.cosine(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("tangent")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.tangent(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("asine")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.invSine(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("acosine")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.invCosine(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("atan")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.invTan(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
                Console.switchDisplay(resultD);

            } else if (sign.toLowerCase().equals("log")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.log(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
            } else if (sign.toLowerCase().equals("10^x")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.invLog(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
            } else if (sign.toLowerCase().equals("Ln")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.natlog(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
            } else if (sign.toLowerCase().equals("e^x")) {
                Double d = Console.getDoubleInput("Enter a double.");
                resultD = SciCal.invNatlog(d);

                System.out.println(d + " " + sign + "= " + " " + resultD);
            } else if (sign.equals("!")) {
                Integer i = Console.getIntegerInput("Enter an Integer");
                result = SciCal.factorial(i);

                System.out.println(i + " " + sign + "= " + " " + result);
            } else
                System.out.println("Error, Please check your input");

            System.out.println("");
            sign = Console.getStringInput("Enter a string");
        }

    }

}

