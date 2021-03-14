package constructors;

public class Test3 {
    // Return type concept is not valid for constructor
    // If we declare return type then compiler considers it as method.
    // Here also we declared method same as class name
    void Test3() {
        System.out.println("This is method");
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.Test3();
    }
}
