package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public void program(String s) {
        Scanner scanner = new Scanner(s);
        List<Integer> list = new ArrayList<>();
        int listLength = Integer.parseInt(scanner.nextLine());
        String[] parts = scanner.nextLine().split(" ");
        for (int i = 0; i < listLength; i++) {
            list.add(Integer.parseInt(parts[i]));
        }
        int numberOfQ = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfQ; i++) {
            String query = scanner.nextLine();
            switch (query) {
                case "Insert":
                    String[] insertParts = scanner.nextLine().split(" ");
                    list.add(Integer.parseInt(insertParts[0]), Integer.parseInt(insertParts[1]));
                    break;
                case "Delete":
                    int indexDel = Integer.parseInt(scanner.nextLine());
                    list.remove(indexDel);
            }
        }
        String vala = list.toString().replace("[","").replace("]","");
        System.out.println(vala);





    }

    public static void main(String[] args) {
        String s = "5\n" +
                "12 0 1 78 12\n" +
                "2\n" +
                "Insert\n" +
                "5 23\n" +
                "Delete\n" +
                "0";
        new Program().program(s);
    }
}
