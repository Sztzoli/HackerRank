package stringtokens;

public class Program {

    public void program(String s){
        s=s.trim();
        if (s.length()==0){
            System.out.println(0);
        } else {
            String[] parts = s.split("[^a-zA-Z]+");
            System.out.println(parts.length);
            for (String word : parts) {
                System.out.println( word);
            }
        }

    }

    public static void main(String[] args) {
        String s = "";
        new Program().program(s);
    }
}
