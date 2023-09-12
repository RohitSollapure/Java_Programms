package Java_Programms.Arrays;

public class Find_Duplicate_values_in_Array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 2, 8, 1, 5, 6, 7, 8 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }

}
