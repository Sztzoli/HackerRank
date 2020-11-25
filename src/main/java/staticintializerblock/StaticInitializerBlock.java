package staticintializerblock;

import java.util.Scanner;

public class StaticInitializerBlock {
    private static int B;
    private static int H;
    static boolean flag=true;
    static {
        Scanner scanner= new Scanner(System.in);
        B=scanner.nextInt();
        H=scanner.nextInt();
        scanner.close();
        try {
            if (B<0 || H<0){
                flag=false;
                throw new Exception( "java.lang.Exception: Breadth and height must be positive");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
