package array2D;

public class Array2D {
    public void program(int[][] table) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < table.length - 2; i++) {
            for (int j = 0; j < table[i].length - 2; j++) {
                int sum = table[i][j] + table[i][j + 1] + table[i][j + 2] + table[i + 1][j + 1] + table[i + 2][j] + table[i + 2][j + 1] + table[i + 2][j + 2];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        new Array2D().program(new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2 ,4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        });
    }
}
