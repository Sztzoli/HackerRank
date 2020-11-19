package arraylist;


import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public void program(){
        Scanner scanner=new Scanner(System.in);

        ArrayList[] al= new ArrayList[20000];
        int numberOfSeparatedList=scanner.nextInt();

        for (int i = 0; i < numberOfSeparatedList; i++) {
            al[i]= new ArrayList();
            int arrayLength=scanner.nextInt();
            for (int j = 0; j < arrayLength; j++) {
                al[i].add(scanner.nextInt());               
                        
            }
        }
        int numberOfQuery=scanner.nextInt();
        for (int i = 0; i < numberOfQuery; i++) {
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            if(y>al[x-1].size()){
                System.out.println("ERROR!");
            } else {
                System.out.println(al[x-1].get(y-1));
            }
            
        }
    }
}
