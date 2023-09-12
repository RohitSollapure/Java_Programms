package Java_Programms.Arrays;

import java.util.Arrays;

public class Remove_Duplicate_Elements_Arry {
    public static int removeduplicateelemeent(int[] arr, int n) {
        if (n <= 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 10, 30, 20, 40, 50, 40 };
        Arrays.sort(arr);
        int length = arr.length;
        length = removeduplicateelemeent(arr, length);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
