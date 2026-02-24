package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "asya1", 4.0));
        students.add(new Student(2, "asya2", 3.9));
        students.add(new Student(3, "asya3", 3.7));
        students.add(new Student(4, "asya4", 3.5));
        students.add(new Student(5, "asya5", 2.9));
    }

    public void removeLowGPA() {
        students.removeIf(s -> s.getGpa() < 2.0);
    }

    public void findHighestGPA() {
        if (students.isEmpty()) return;
        Student top = students.get(0);
        for (Student s : students) {
            if (s.getGpa() > top.getGpa()) {
                top = s;
            }
        }
        System.out.println("Top student: " + top);
    }

    public void insertAtIndex() {
        if (students.size() >= 2) {
            students.add(2, new Student(6, "asya6", 3.5));
        }
    }

    public void printStudents() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}