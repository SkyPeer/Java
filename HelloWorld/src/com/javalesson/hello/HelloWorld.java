package com.javalesson.hello;

public class HelloWorld {

    public static void main(String[] args){

        System.out.println("Hello world!!!");

        byte b = 10;
        short c = 200; //по таблице переменных от  -32768 до 32767
        int a = b + 23; // int тип переменной
        long myLongValue = 123_456_789_876_543_211_2L;
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

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + "some other string";
        System.out.println(s);

        if(b1){
            System.out.println("b1 = true"); // b1 = true
        }

        short someShort = b; //b = 10
        int someInt = someShort;

        someShort = (short) someInt; // type of INT > type of SHORT!!!

        System.out.println("myLongValue = " + myLongValue);
        someInt = (int) myLongValue;

        System.out.println(" someInt = (int) myLongValue = " + someInt);
        System.out.println("someShort = " + someShort);

//      System.out.println("myLongValue = " + myLongValue + "  someInt by myLongValue (again) = " + someInt);

        double someDouble = myFloatVal;
        System.out.println("myFloatVal (bofore) = " + myFloatVal + " someDouble (by myFloatVal) = " + someDouble);

        double someIntToDouble = someInt;
        System.out.println("someInt = " + someInt);
        System.out.println("someIntToDouble = " + someIntToDouble);

        double someLongToDouble = myLongValue;
        System.out.println("myLongValue = " + myLongValue + " someLongToDouble (double of myLongValue) = " + someLongToDouble);

        long someDoubleToLong = (long) someLongToDouble;
        System.out.println("someDoubleToLong = " + someDoubleToLong);

        float testFloat1 = 1.96f;
        float testFloat2 = 0.04f;

        System.out.println("testFloatResult = " + ( testFloat1 + testFloat2 ));
        System.out.println("int by testFloatResult = " + (int)( testFloat1 + testFloat2 ));
    }
}
