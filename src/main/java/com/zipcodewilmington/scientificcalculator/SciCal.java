package com.zipcodewilmington.scientificcalculator;

public class SciCal {
    private Double Memory;
    private static int radordeg = 0;
    private static int displayNum =0;


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
    public static void switchDisplayMode(double val){
        if ( displayNum== 0){
            switchDisplayMode("Hexadecimal",val);
            displayNum++;
        }else if(displayNum  ==1){
            switchDisplayMode("Binary", val);

        }else if (displayNum == 2){
            switchDisplayMode("Octal",val);
            displayNum++;
        }else {
            switchDisplayMode("", val);
            displayNum = 0;
        }
    }



    public static void switchDisplayMode(String choice, double value){
        Integer val = (int)value;
        switch(choice){
            case "Hexadecimal":
                System.out.println(val.toHexString(val));
                break;
            case "Binary":
                System.out.println(val.toBinaryString(val));
                break;
            case "Octal" :
                System.out.println(val.toOctalString(val));
                break;
            case "Decimal" :
                System.out.println("%d"+val);
                break;
        }
    }

    public static void switchUnitsMode(double val){
        if (radordeg == 0){
            switchUnitsMode("Radians",val);
            radordeg++;
        }else {
            switchUnitsMode("Degrees", val);
            radordeg = 0;
        }
    }

    public static void switchUnitsMode(String mode, double val){

        if(mode.toLowerCase().equals("Radians")) {
            System.out.println(""+Math.toRadians(val));
        } else if(mode.toLowerCase().equals("degrees")) {
            System.out.println(""+Math.toDegrees(val));
        }
    }
}

