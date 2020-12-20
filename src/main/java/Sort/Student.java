package Sort;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String fname;
    private int id;
    private double cgpa;

    public Student(int ID, String firstName, double CGPA) {
        this.fname = firstName;
        this.id = ID;
        this.cgpa = CGPA;
    }

    public String getFname() {
        return fname;
    }

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.cgpa, cgpa) == 0 && Objects.equals(fname, student.fname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, id, cgpa);
    }

    @Override
    public int compareTo(Student o) {
        int atlag;
        if (cgpa <o.cgpa){
            atlag=1;
        } else if (cgpa >o.cgpa) {
            atlag=-1;
        } else {
            atlag=0;
        }
        if (atlag!=0) {
            return atlag;
        } else {
            int cmpFirstName = fname.compareTo(o.fname);
            if (cmpFirstName!=0){
                return cmpFirstName;
            } else {
                if (id <o.id){
                    return 1;
                } else {
                    return -1;
                }
            }
        }

    }
}
