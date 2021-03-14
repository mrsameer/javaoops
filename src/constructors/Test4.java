// Demonstration of which modifiers among 12 modifiers are available to the constructor
package constructors;

public class Test4 {
    // applicable modifiers are default, public, protected, private
    private Test4() {
        System.out.println("This is a private constructor");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
    }
}

class Test4_1 {
    public Test4_1() {
        System.out.println("This is a public constructor");
    }

    public static void main(String[] args) {
        Test4_1 t = new Test4_1();
    }
}

class Test4_2 {
    Test4_2() {
        System.out.println("This is a default constructor");
    }

    public static void main(String[] args) {
        Test4_2 t = new Test4_2();
    }
}

class Test4_3 {
    protected Test4_3() {
        System.out.println("This is a protected constructor");
    }

    public static void main(String[] args) {
        Test4_3 t = new Test4_3();
    }
}