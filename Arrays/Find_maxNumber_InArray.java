package Java_Programms.Arrays;

public class Find_maxNumber_InArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 9, 8, 7 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
