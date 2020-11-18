package array1D;

import java.util.Scanner;

public class Array1D {
    public void program(int n) {
        int[] array=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=Integer.parseInt(new Scanner(System.in).nextLine());
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

    public static void main(String[] args) {
        new Array1D().program(5);
    }
}
