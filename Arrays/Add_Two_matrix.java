package Java_Programms.Arrays;

import java.util.*;

class add_matrix {
    public static void add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b.length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}

public class Add_Two_matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int row = sc.nextInt();
        System.out.println("ENTER THE NUMBER OF COLUMNS");
        int col = sc.nextInt();

        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

        System.out.println("---------1st matrix----------");
        System.out.println("ENTER THE VALUES");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("secound matrix");
        System.out.println("ENTER THE VALUES");

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("---------------FINAL OUT PUT----------");

        add_matrix ad = new add_matrix();
        ad.add(a, b);

    }
}
