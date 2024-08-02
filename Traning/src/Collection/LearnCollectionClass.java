package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {


 // Student comparable method
 List<Student> list = new ArrayList<>();

 list.add(new Student("Anuj",23));
 list.add(new Student("yAman",43));
 list.add(new Student("Ashulj",22));
 list.add(new Student("koshak",3));
 list.add(new Student("jay",9));

 Student s1 = new Student("Anuj",23);
 Student s2 = new Student("Ashulj",22);

 // comparabel method
  //      System.out.println(s1.compareTo(s2));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //sort via name comparable method in anonymous function
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list);
//        List<Integer> list = new ArrayList<>();
//
//        list.add(43);
//        list.add(6);
//        list.add(3);
//        list.add(33);
//        list.add(20);
//        System.out.println(list);
//        // to find the min and max element in list
//        System.out.println("Min Element "+ Collections.min(list));
//        System.out.println("Max Element "+ Collections.max(list));
//
//        // print in reverse order
//        Collections.sort(list, Comparator.reverseOrder());
//        System.out.println(list);



    }
}
