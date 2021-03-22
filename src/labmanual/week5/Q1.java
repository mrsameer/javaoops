/*
1. Write a Java Program to implement Wrapper classes and their methods.
 */
package labmanual.week5;

public class Q1 {
    public static void main(String[] args) {
        // create primitive types
        int a = 5;
        double b = 5.54;

        // convert primitive types info wrapper objects (boxing)
        Integer aObj = Integer.valueOf(a);
        Double bObj = Double.valueOf(b);

        if (aObj instanceof Integer)
            System.out.println("An Integer object is created");
        if (bObj instanceof Double)
            System.out.println("A Double object is created");

        // convert objects into primitive types (unboxing)
        int aint = aObj.intValue();
        double bdoub = bObj.doubleValue();

        System.out.println("The value of aint " + aint);
        System.out.println("The value of bdub " + bdoub);
    }
}
