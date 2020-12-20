package validusernameregularexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidUserName {


    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9]");
        System.out.println(p.matcher("zoli").find());

    }

    }



