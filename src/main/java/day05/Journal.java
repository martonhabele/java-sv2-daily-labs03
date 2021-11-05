package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> students = new ArrayList<>();

    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent("Béla"));
        System.out.println(journal.addStudent("Kis Béla"));
    }

    public boolean addStudent(String studentName) {
        if (studentName.indexOf(' ') > 0) {
            students.add(studentName);
            return true;
        }
        else return false;
    }
}