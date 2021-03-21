/*
Matrix Addition
 */
package labmanual.week2;

import java.util.Scanner;

public class MatAddn {
    public int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
}

class MatAddnDemo {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the dimensions of the first matrix: ");
        int i = sc.nextInt();
        int j = sc.nextInt();

        System.out.print("Enter the dimensions of the second matrix: ");
        int k = sc.nextInt();
        int l = sc.nextInt();

        int[][] a = new int[i][j];
        System.out.println("Enter the first matrix");
        for (int m = 0; m < i; m++) {
            for (int n = 0; n < j; n++) {
                a[m][n] = sc.nextInt();
            }
        }

        int[][] b = new int[k][l];
        System.out.println("Enter the second matrix");
        for (int m = 0; m < k; m++) {
            for (int n = 0; n < l; n++) {
                b[m][n] = sc.nextInt();
            }
        }

        if (i == k && j == l) {
            MatAddn m = new MatAddn();
            int[][] result;
            System.out.println("THe result is: ");
            result = m.add(a, b);
            for (int n = 0; n < i; n++) {
                for (int o = 0; o < j; o++) {
                    System.out.print(result[n][o] + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Dimensions of matrices should be equal so as to add them");
    }
}