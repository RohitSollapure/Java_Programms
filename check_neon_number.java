package Java_Programms;

import java.util.Scanner;

public class chech_neon_number

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num = sc.nextInt();
        int squre = num * num;
        int sum = 0;
        while (squre > 0) {
            int last = squre % 10;
            sum = sum + last;
            squre = squre / 10;
        }
        System.out.println();
        if (num == sum) {
            System.out.println("Neon number");

        } else {
            System.out.println("Not aneon number"); // 9 = 81 8+1=9
        }
    }
}
