import lesson4.Lesson4;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Lesson4 lesson4 = new Lesson4();

      /* int num1 = 127;
        int num2 = 128;

       */


        int num1 = 127;
        int num2 = 128;

        long resultLong1 = lesson4.intToLong(num1);
        long resultLong2 = lesson4.intToLong(num2);
        byte resultByte1 = lesson4.intToByte(num1);
        byte resultByte2 = lesson4.intToByte(num2);
        double resultDouble1 = lesson4.intToDouble(num1);
        double resultDouble2 = lesson4.intToDouble(num2);
        int resultInt1 = lesson4.doubleToInt(resultDouble1);
        int resultInt2 = lesson4.doubleToInt(resultDouble2);


       /* System.out.println("Converted value to long: " + resultLong1);
        System.out.println("Converted value to long: " + resultLong2);
        System.out.println("Converted value to byte: " + resultByte1);
        System.out.println("Converted value to byte: " + resultByte2);
        System.out.println("Converted value to double: " + resultDouble1);
        System.out.println("Converted value to double: " + resultDouble2);
        System.out.println("Converted value to int: " + resultInt1);
        System.out.println("Converted value to int: " + resultInt2); */


        System.out.println("---------------------");
        String str = "I study JAVA!";

        System.out.println("str.length() : " + Lesson4.strLength(str));
        System.out.println("str.charAt(4) : " + Lesson4.strChart(4, str));
        System.out.println( " str.substring(3, 6) : "+ Lesson4.strSubstring(str,3, 6));
        System.out.println(" str.substring(3, str.length()) : "+ Lesson4.strSubstring(str,3, Lesson4.strLength(str)));
        System.out.println();

        int a = 3;
        int b = 5;
        Calculator calculator = new Calculator();

        calculator.printCalculate(a, b);
        System.out.println("..................");
        calculator.printCalculate(20,10);

        System.out.println("calculator.getSum(a,b) = " + calculator.getSum(a, b));

    }



}