public class Calculator {
    public void printCalculate(int a, int b) {

        System.out.println("sum = " + getSum(a, b));
        System.out.println("min = " + getMin(a, b));
        System.out.println("mult = " + getMult(a, b));
        System.out.println("divine = " + getDivine(a, b));
    }

    public  int getDivine(int a, int b) {
        return a / b;
    }

    public  int getMult(int a, int b) {
        return a * b;
    }

    public int getMin(int a, int b) {
        return a - b;
    }

    public int getSum(int a, int b) {
        return a + b;
    }

}
