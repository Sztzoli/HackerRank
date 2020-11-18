package javastringreverse;

public class JavaStringReverse {
    public void program(String A){
        StringBuilder sb=new StringBuilder(A);
        sb.reverse();
        if (A.equals(sb.toString())){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void main(String[] args) {
        new JavaStringReverse().program("madam");
    }
}
