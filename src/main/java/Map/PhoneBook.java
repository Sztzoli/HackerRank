package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

    public void program(String s) {
        Scanner scanner = new Scanner(s);
        int index = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < index; i++) {
            String name = scanner.nextLine();
            int phoneNumber = Integer.parseInt(scanner.nextLine());

            map.put(name,phoneNumber);
        }
        for (int i = 0; i < index; i++) {
            String name= scanner.nextLine();
            if (map.containsKey(name)) {
                System.out.println(name+"="+map.get(name));
            } else {
                System.out.println("Not Found");
            }

        }
    }

    public static void main(String[] args) {
        String s= "3\n" +
                "uncle sam\n" +
                "99912222\n" +
                "tom\n" +
                "11122222\n" +
                "harry\n" +
                "12299933\n" +
                "uncle sam\n" +
                "uncle tom\n" +
                "harry";

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.program(s);
    }

}
