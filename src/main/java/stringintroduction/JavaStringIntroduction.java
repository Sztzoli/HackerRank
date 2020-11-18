package stringintroduction;

public class JavaStringIntroduction {

    public void program(String a, String b){
        System.out.println(a.length()+b.length());
        if (a.compareTo(b)>0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));
    }


    public static void main(String[] args) {
        new JavaStringIntroduction().program("hello","java");
    }

}
