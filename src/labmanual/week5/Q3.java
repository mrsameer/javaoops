/*
3. Write a JAVA program for the following a. Call by Value   b. Call by Object
 */
package labmanual.week5;

public class Q3 {

  int data = 100;

  public void change(int data) {
      data = data + 50;
  }

  public void change(Q3 q3) {
      q3.data = q3.data +50;
  }

    public static void main(String[] args) {
      Q3 q3 = new Q3();
        // call by value demonstration
        System.out.println("Before calling method, data = " + q3.data);
        q3.change(100);
        System.out.println("After calling method, data = " + q3.data);

        // call by reference demonstration
        System.out.println("Before calling method, data = " + q3.data);
        q3.change(q3);
        System.out.println("After calling method, data = " + q3.data);
    }
}
