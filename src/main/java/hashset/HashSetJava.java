package hashset;

import java.util.*;

public class HashSetJava {

    void program(String s ) {
        Scanner scanner = new Scanner(s);
        int index = Integer.parseInt(scanner.nextLine());
        String[] pair_left = new String[index];
        String[] pair_right = new String[index];
        for (int i = 0; i < index; i++) {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < index; i++) {
            hashSet.add(pair_left[i]+" "+ pair_right[i]);
            System.out.println(hashSet.size());
        }



    }


    public static void main(String[] args) {
        String s = "5\n" +
                "john tom\n" +
                "john mary\n" +
                "john tom\n" +
                "mary anna\n" +
                "mary anna";

        String s1 = "0";

        new HashSetJava().program(s);
        new HashSetJava().program(s1);


    }

}
