package subarray;


import java.util.Arrays;

public class Subarray {

    public void program(int[] a){

        int count=0;
        for (int i=1;i<=a.length;i++) {

            for (int j = 0; j <= a.length-i; j++) {
            int[] subArray= Arrays.copyOfRange(a,j,j+i);
                int sum=0;
                for (int elem: subArray ) {
                    sum+=elem;
                }
                if (sum<0){
                    count++;
                }
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        new Subarray().program(new int[]{1, -2, 4, -5, 1});
    }

}
