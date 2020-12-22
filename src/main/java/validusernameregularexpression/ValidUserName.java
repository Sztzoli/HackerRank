package validusernameregularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserName {


    public static void program(String s) {
        Scanner scanner = new Scanner(s);
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            String name = scanner.nextLine();
            Pattern pattern = Pattern.compile("[A-Za-z]{1}+[A-Za-z_0-9]{7,29}");


            Matcher matcher = pattern.matcher(name);
            if (matcher.find() ) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }


    public static void main(String[] args) {
        String s = "8\n" +
                "Julia\n" +
                "Samantha\n" +
                "Samantha_21\n" +
                "1Samantha\n" +
                "Samantha?10_2A\n" +
                "JuliaZ007\n" +
                "Julia@007\n" +
                "_Julia007";

        program(s);

    }

}



