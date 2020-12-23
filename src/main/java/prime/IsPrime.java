package prime;

import java.math.BigInteger;
import java.util.Scanner;

public class IsPrime {

    static void program(String str){
        Scanner scanner = new Scanner(str);
        BigInteger a = new BigInteger(scanner.nextLine());
        if (a.isProbablePrime(1)){
            System.out.println("prime");

        } else {
            System.out.println("not prime");
        }
    }

    public static void main(String[] args) {
        String s= "13";
        program(s);
    }
}
