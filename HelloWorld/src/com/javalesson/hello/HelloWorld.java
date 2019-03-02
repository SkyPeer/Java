package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello world!!!");

        byte b = 10;
        short c = 200; //по таблице переменных от  -32768 до 32767
        int a = b + 23; // int тип переменной
        long myLongValue = 123_456_789L;
        float myFloatVal = 23.56f;
        double myDoubleVal = 56.46d;

            double sum = a+b+c+myLongValue + myDoubleVal + myFloatVal;
        System.out.println("SUM = " + sum);

        float floatResult = myFloatVal / 3;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;

        System.out.println("myDoubleResult = " + myNewDouble / 3);

        System.out.println("byte b =" +b);
        System.out.println("short c =" +c);
        System.out.println("int a =" +a);
        System.out.println("myLongValue =" +myLongValue);
    }
}
