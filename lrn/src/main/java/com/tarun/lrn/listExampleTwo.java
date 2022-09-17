package com.tarun.lrn;

import java.util.ArrayList;
import java.util.List;

public class listExampleTwo {
    public static void main(String args[])
    {
        List<Student> students = new ArrayList<>();


        Student student = new Student();
        Libraray libraray = new Libraray();
        student.setStudentId(1);
        student.setFirstName("Tarun");
        student.setLastName("Simha");
        student.setAge(26);
        students.add(student);
        libraray.setBookName("Sachin");
        libraray.setId(1);

        for (Student std:students) {
            System.out.println(std.firstName);
            System.out.println(std.lastName);
        }
    }
}
