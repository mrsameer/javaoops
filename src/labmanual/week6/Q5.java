/*
5. Write an application to create a super class Vehicle with information vehicle
number,insurance number,color and methods getConsumption() displayConsumption().
Derive the sub-classes TwoWheeler and FourWheeler with method maintenance() and
average() to print the maintenance And average of vehicle.
 */
package labmanual.week6;

class Vehicle {
    int vno;
    int ino;
    String color;

    public Vehicle(int vno, int ino, String color) {
        this.vno = vno;
        this.ino = ino;
        this.color = color;
    }
    public int getConsumption() {
        return 0;
    }

    public void displayConsumption() {
        System.out.println("This is displayConsumption method in Vehicle class");
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(int vno, int ino, String color) {
        super(vno, ino, color);
    }

    public void maintenance() {
        System.out.println("This is maintenance method in TwoWheeler class");
    }

    public void average() {
        System.out.println("This is average method in TwoWheeler class");
    }

    @Override
    public String toString() {
        return "TwoWheeler{" +
                "vno=" + vno +
                ", ino=" + ino +
                ", color=" + color +
                '}';
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler(int vno, int ino, String color) {
        super(vno, ino, color);
    }
    public void maintenance() {
        System.out.println("This is maintenance method in FourWheeler class");
    }

    public void average() {
        System.out.println("This is average method in FourWheeler class");
    }

    @Override
    public String toString() {
        return "FourWheeler{" +
                "vno=" + vno +
                ", ino=" + ino +
                ", color=" + color +
                '}';
    }
}
public class Q5 {
    public static void main(String[] args) {
        // create TwoWheeler object
        TwoWheeler twoWheeler = new TwoWheeler(123, 23324, "blue");
        System.out.print(twoWheeler);
        System.out.print(" and consumption is " + twoWheeler.getConsumption());
        System.out.print(" ");
        twoWheeler.average();
        twoWheeler.displayConsumption();
        System.out.println();

        // create FourWheeler object
        FourWheeler fourWheeler = new FourWheeler(123, 23324, "blue");
        System.out.print(fourWheeler);
        System.out.print(" and consumption is" + fourWheeler.getConsumption());
        System.out.print(" ");
        fourWheeler.average();
        fourWheeler.displayConsumption();
        System.out.println();

    }
}
