package javaanagrams;

import java.util.ArrayList;
import java.util.List;

public class JavaAnagrams {
    public void program(String a, String b){
        a=a.toLowerCase();
        b=b.toLowerCase();

        boolean ok=true;
        int i=0;
        List<Character> list = new ArrayList<>();
        while (i<a.length() && ok){
            char c=a.charAt(i);
            if(!list.contains(c)){
                list.add(c);
                if (charSum(c,a)!=charSum(c,b)){
                    ok=false;
                }
            }
            i++;
        }
        if (ok && a.length()==b.length()){
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }
    private int charSum(char c,String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==c){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        new JavaAnagrams().program("anagram","margana");
    }
}
