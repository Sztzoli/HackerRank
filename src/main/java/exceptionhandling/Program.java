package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        String s="2147483648\n" +
                "2147483648";

        Scanner scanner = new  Scanner(s);
        try {
            int a = scanner.nextInt();
            scanner.nextLine();
            int b = scanner.nextInt();
            int n = a/b;
            System.out.println(n);
        }
        catch (ArithmeticException e){
            System.out.println(e.getClass().getName() + e.getLocalizedMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
    }
}
