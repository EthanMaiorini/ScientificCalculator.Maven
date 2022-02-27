package com.zipcodewilmington.scientificcalculator;

public class SciCal {
    private Double Memory;


    public double memoryAccess(){
        return Memory;
    }
    public void resetMemory(){
        Memory = 0.0;
    }

    public void addToMemory(double currentValue){
        Memory = currentValue;
    }

    public static double sine(double input){
        return Math.sin(input);
    }

    public static double cosine(double input){
        return Math.cos(input);
    }

    public static double tangent(double input){
        return Math.tan(input);
    }

    public static double invSine(double input){
        return Math.asin(input);
    }

    public static double invCosine(double input){
        return Math.acos(input);
    }

    public static double invTan(double input){
        return Math.atan(input);
    }

    public static double log(double input){
        return Math.log(input);
    }

    public static double invLog(double input){
        return Math.log10(input);
    }

    public static double natlog(double input){
        return Math.log1p(input);
    }

    public static double invNatlog(double input){
        return Math.exp(input);
    }

    public static int factorial(int input){
        int value=1;
        for(int n =1;n<=input;n++){
            value *= n;
        }
        return value;
    }

    //Switch display
}
