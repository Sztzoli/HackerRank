package BitSetJava;

import java.util.BitSet;
import java.util.Scanner;

public class Program {

    public static void program(String s) {
        Scanner scanner = new Scanner(s);
        int sizeOfBitSet = Integer.parseInt(scanner.next());
        int index = Integer.parseInt(scanner.next());
        BitSet[] array = new BitSet[2];
        array[0] = new BitSet(sizeOfBitSet);
        array[1] = new BitSet(sizeOfBitSet);
        for (int i = 0; i < index; i++) {
            String condition=scanner.next();
            int x = Integer.parseInt(scanner.next())-1;
            int y = Integer.parseInt(scanner.next());

            switch (condition) {
                case "AND":
                    if (x==0) {
                        array[0].and(array[1]);
                    } else {
                        array[1].and(array[0]);
                    }
                    break;
                case "SET":
                    array[x].set(y);
                    break;
                case "FLIP":
                    array[x].flip(y);
                    break;
                case "OR":
                    if (x==0) {
                        array[0].or(array[1]);
                    } else {
                        array[1].or(array[0]);
                    }
                    break;
                case "XOR":
                    if (x==0) {
                        array[0].xor(array[1]);
                    } else {
                        array[1].xor(array[0]);
                    }
                    break;
                default:
                    break;
            }
            System.out.println(array[0].cardinality()+" "+array[1].cardinality());
        }

    }

    public static void main(String[] args) {
        String s = "5 4\n" +
                "AND 1 2\n" +
                "SET 1 4\n" +
                "FLIP 2 2\n" +
                "OR 2 1";
        String s2 = "10 50\n" +
                "AND 1 2\n" +
                "XOR 1 2\n" +
                "XOR 1 2\n" +
                "AND 2 1\n" +
                "XOR 1 2\n" +
                "SET 1 1\n" +
                "SET 1 0\n" +
                "XOR 2 1\n" +
                "OR 1 2\n" +
                "FLIP 2 1\n" +
                "OR 2 1\n" +
                "FLIP 1 4\n" +
                "AND 1 2\n" +
                "OR 1 2\n" +
                "OR 2 1\n" +
                "XOR 1 2\n" +
                "SET 1 3\n" +
                "AND 1 2\n" +
                "SET 2 8{-truncated-}\n" +
                "\n" +
                "Download to view the full testcase\n" +
                "Expected Output\n" +
                "\n" +
                "Download\n" +
                "0 0\n" +
                "0 0\n" +
                "0 0\n" +
                "0 0\n" +
                "0 0\n" +
                "1 0\n" +
                "2 0\n" +
                "2 2\n" +
                "2 2\n" +
                "2 1\n" +
                "2 2\n" +
                "3 2\n" +
                "2 2\n" +
                "2 2\n" +
                "2 2\n" +
                "0 2\n" +
                "1 2\n" +
                "0 2\n" +
                "0 3\n" +
                "3 3{-truncated-}";


        program(s2);

    }
}
