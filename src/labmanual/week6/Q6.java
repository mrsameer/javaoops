/*
6. Extend the above TwoWheeler class with methods getType() and getName()
which gives the information about the type and the name of the company. Create sub-classes
Geared and NonGeared with method average() to print the average of a geared and non-
geared two wheeler.
 */
package labmanual.week6;

class Geared extends TwoWheeler {
    String type;
    String name;

    public Geared(int vno, int ino, String color, String type, String name) {
        super(vno, ino, color);
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public void average() {
        System.out.println("This is the average method in the Geared class");
    }

    @Override
    public String toString() {
        return "Geared{" +
                "vno=" + vno +
                ", ino=" + ino +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

class NonGeared extends TwoWheeler {
    String type;
    String name;

    public NonGeared(int vno, int ino, String color, String type, String name) {
        super(vno, ino, color);
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public void average() {
        System.out.println("This is the average method in the NonGeared class");
    }

    @Override
    public String toString() {
        return "NonGeared{" +
                "vno=" + vno +
                ", ino=" + ino +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Q6 {
    public static void main(String[] args) {
        // create Geared class
        Geared geared = new Geared(123, 2345, "green", "bike", "honda");
        System.out.println(geared);
        geared.average();

        System.out.println("*************************************");
        // create NonGeared class
        NonGeared nonGeared = new NonGeared(2334, 3434, "blue", "scooty", "suzuki");
        System.out.println(nonGeared);
        nonGeared.average();
    }
}
