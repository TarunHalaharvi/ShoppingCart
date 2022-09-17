package com.tarun.lrn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class listExample {
    public static void main(String args[])
    {
        Collection values =  new ArrayList();
        values.add(4);
        values.add(5);
        values.add(6);
        values.add("Tarun");

        System.out.println(values);//this will specify the output in following format [4, 5, 6]
        //if you want to specify in a different line use iterator

        Iterator itr  = values.iterator();
//        System.out.println("*******************");
//        System.out.println(itr.next());//this will display 4
//        System.out.println(itr.next());//this will display 5
//        System.out.println(itr.next());// this will display 6
//        System.out.println("************************");
        //instead of writing 3 different lines use while

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //instead of iterator we can use for loop

        for(Object o : values)
        {
            System.out.println(o);
        }

        System.out.println("*****************************************");
        List<String> students = new ArrayList<String>();
        students.add("Tarun");
        students.add("Virat");
        students.add(0,"Kl");

        System.out.println(students);
        for (String str: students
             ) {
            System.out.println(str);
        }

        System.out.println("****************************************");
    }
}
