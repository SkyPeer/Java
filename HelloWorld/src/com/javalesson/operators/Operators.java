package com.javalesson.operators;

public class Operators {

    public static void main(String[] args) {
//          + - / *  % - остаток от деления
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        //incriment DEcriment
        //a = a + 5;
        a += 5;
        a++; // инкриментирование

        System.out.println("New a = " + a);


        --b;
        System.out.println("New b = " + b);

        double n = 7;
        double m = 7;

        double res1 = 2 * n++; //postFix-ная операция
        double res2 = 2 * ++m; //preFix-ная операция

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);


// == != < > <= >= && || ?:

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = n >= m;

        System.out.println("BoolVal = "+boolVal);

        boolean boolVal2 = y<z;

        boolean resultBoolean = boolVal && boolVal2;



        System.out.println("resultBoolean = "+resultBoolean);
    }



}

