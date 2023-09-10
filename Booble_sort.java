package Java_Programms;

public class Booble_sort {
    public static void sort(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arry = { 2, 4, 6, 5, 3, 1 };
        for (int i = 0; i < arry.length - 1; i++) {
            for (int j = 0; j < arry.length - 1 - i; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }

        sort(arry);

        // for(int i=0; i<arry.length; i++) {
        // System.out.print(arry[i]+" ");
        // }
        //

    }

}
