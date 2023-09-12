package Java_Programms.Arrays;

import java.util.*;

public class Find_value_in_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRY");
        int size = sc.nextInt();

        int num[] = new int[size];

        // INPUT
        System.out.println("ENTER THE VALUES");
        for (int i = 0; i < size; i++) {

            num[i] = sc.nextInt();
        }

        System.out.println("enter x value");
        int x = sc.nextInt();
        // OUTPUT

        System.out.println("----------OUTPUT---------------");
        for (int i = 0; i < size; i++) {
            if (x == num[i])
                System.out.println("The value x:" + x + " is present at the index:" + i);
        }
    }
}
