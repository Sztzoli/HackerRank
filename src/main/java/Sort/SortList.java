package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortList {
    private List<Student> students = new ArrayList<>();

    public void init(String s){
        Scanner scanner=new Scanner(s);
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < index; i++) {
            String[] parts = scanner.nextLine().split(" ");
            students.add(new Student(Integer.parseInt(parts[0]),parts[1], Double.parseDouble(parts[2]) ));
        }
    }
    public void sortedList(){
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student.getFname());
        }
    }

    public static void main(String[] args) {
        String s= "5\n" +
                "33 Rumpa 3.68\n" +
                "85 Ashis 3.85\n" +
                "56 Samiha 3.75\n" +
                "19 Samara 3.75\n" +
                "22 Fahim 3.76";

        String s1 = "5\n" +
                "33 Rumpa 3.68\n" +
                "85 Ashis 3.85\n" +
                "56 Samiha 3.75\n" +
                "19 Samara 3.75\n" +
                "22 Fahim 3.76";

        SortList sortList = new SortList();
        sortList.init(s);
        sortList.sortedList();
    }
}
