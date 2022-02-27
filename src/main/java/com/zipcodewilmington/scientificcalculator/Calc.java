package com.zipcodewilmington.scientificcalculator;

public class Calc {

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

    public static int multiply(int firstValue, int secondValue){
        return firstValue * secondValue;
    }

    public static double multiply(double firstValue, double secondValue){
        return (double)(firstValue * secondValue);
    }

    public static int divide(int firstValue, int secondValue){
        return firstValue / secondValue;
    }

    public static double divide(double firstValue, double secondValue){
        return firstValue / secondValue;
    }

    public static double squareRt(int firstValue){
        return Math.sqrt((double)firstValue);
    }

    public static double squareRt(double firstValue){
        return Math.sqrt(firstValue);
    }

    public static int square(int firstValue){
        return (int)Math.pow(firstValue,2);
    }

    public static double square(double firstValue){
        return Math.pow(firstValue,2);
    }

    public static int square(int firstValue,int secondValue){
        return (int)Math.pow(firstValue,secondValue);
    }

    public static double power(double firstValue, double secondValue){
        return Math.pow(firstValue,secondValue);
    }

    public static double inverse(int firstValue){
        return 1/firstValue;
    }

    public static double inverse(double firstValue){
        return 1/firstValue;
    }

    public static int changeSign(int firstValue){
        return (firstValue *-1);
    }

    public static double changeSign(double firstValue){
        return (firstValue *-1);
    }

}

