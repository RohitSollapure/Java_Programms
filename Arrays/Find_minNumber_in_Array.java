package Java_Programms.Arrays;

public class Find_minNumber_in_Array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 5, 4, 7, 89 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
