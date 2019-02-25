package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args){
        System.out.println("Hello world!!!");

        byte b = 10;
        short c = 32000; //по таблице переменных от  -32768 до 32767
        int a = b + 23; // int тип переменной
        //long myLongValue = 456789;
        long myLongValue = 123456789;

        System.out.println("byte b =" +b);
        System.out.println("short c =" +c);
        System.out.println("int a =" +a);
        System.out.println("myLongValue =" +myLongValue);
    }
}
