package patternsyntaxchecker;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Program {

    public void program(String s) {
        try{
            Pattern pattern = Pattern.compile(s);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        String s1 = "([A-Z])(.+)";
        String s2= "[AZ[a-z](a-z)";
        String s3 = "batcatpat(nat";

        new Program().program(s1);
        new Program().program(s2);
        new Program().program(s3);
    }
}
