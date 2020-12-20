package generics;

import java.util.List;

public class Program {

    public void printArray(Object[] objects){
        for (Object o : objects) {
            System.out.println(o.toString());
        }
    }
}
