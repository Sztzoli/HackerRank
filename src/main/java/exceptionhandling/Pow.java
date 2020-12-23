package exceptionhandling;

public class Pow {

    static int power(int n, int p) throws Exception{
        if (n<0 || p<0){
            throw new Exception("n or p should not be negative.");
        }
        if (n==0 && p==0){
            throw new Exception("n and p should not be zero");
        }
        int pow=n;
        if (p==0){
            return 1;
        }
        for (int i = 2; i <= p; i++) {
            pow*=n;
        }
        return pow;
    }

    public static void main(String[] args) {
        try {
            System.out.println(power(3,5));
        } catch (Exception e){
            System.out.println(e.getClass().getName() +": "+ e.getMessage());
        }
    }
}
