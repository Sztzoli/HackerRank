package substring;

public class JavaSubstring {

    public void program(String S, int start, int end) {
        System.out.println(S.substring(start, end));
    }

    public static void main(String[] args) {
        new JavaSubstring().program("Helloworld", 3, 7);
    }
}
