package biginteger;



import java.util.Scanner;

public class Program {


    public void program(String s) {
        Scanner scanner = new Scanner(s);
        java.math.BigInteger a = new java.math.BigInteger(scanner.nextLine());
        java.math.BigInteger b = new java.math.BigInteger(scanner.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }

    public static void main(String[] args) {
        String s = "1234\n" +
                "20";
        new Program().program(s);
    }
}
