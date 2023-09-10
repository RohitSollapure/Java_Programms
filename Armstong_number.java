package java_programs;

import java.util.Scanner;
import java.lang.Math;

public class amstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp, digit = 0;

        System.out.println("Enter a number");
        int num = sc.nextInt();
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = num;
        int last = 0;
        int sum = 0;

        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("NOt- Amstrong  nummber");
        }
    }

}
// Amstrong numbers 1,2,3,4,5,6,7,8,9,153,370,371,407