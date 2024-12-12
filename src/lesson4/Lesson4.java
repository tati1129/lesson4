package lesson4;

public class Lesson4 {

    public long newLong;
    public byte newByte;
    public double newDouble;
    public int newInt;
    //static public String str;
    static public String charStr;
    //static public int index;



    public long intToLong(int num){
        newLong = num;
        return newLong;
    }

    public byte intToByte(int num){
        newByte = (byte) num;
        return newByte;
    }

    public double intToDouble(int num){
        newDouble = (double) num;
        return newDouble;
    }
    public int doubleToInt(double num){
        newInt = (int) num;
        return newInt;
    }

    public static int strLength(String str){
        return str.length();
    }

    public static String strChart(int index, String str){
        charStr =  String.valueOf(str.charAt(index));
        return charStr;
    }

    public static String strSubstring(String str,int startIndex,int endIndex){
        return str.substring(startIndex,endIndex);
    }
}
