package labmanual.week1;

public class MyCalculator implements Calculator{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float sub(float a, float b) {
        return a - b;
    }

    @Override
    public float mul(float a, float b) {
        return a * b;
    }

    @Override
    public float div(float a, float b) {
        return a / b;
    }
}

class MyCalculatorDemo {
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();
        System.out.println(c.add(1, 2));
        System.out.println(c.add(1.2f, 2.3f));
        System.out.println(c.sub(1, 2));
        System.out.println(c.sub(2.2f, 3.4f));
        System.out.println(c.mul(1, 2));
        System.out.println(c.mul(1.3f, 3.4f));
        System.out.println(c.div(1, 2));
        System.out.println(c.div(1.2f, 4.5f));
    }
}