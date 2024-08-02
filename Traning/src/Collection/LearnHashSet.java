package Collection;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        // hash set , tree set , Linked set


      //  Set<Integer> set = new HashSet<>();
     // Set<Integer> set = new LinkedHashSet<>();
        // for the Student set example
        Set<Student> studnetSet = new HashSet<>();

        studnetSet.add(new Student("Harsh", 2));
        studnetSet.add(new Student("Krish", 3));
        studnetSet.add(new Student("Mohit", 4));

        studnetSet.add(new Student("Harsh", 5));


        System.out.println(studnetSet);
//        Set<Integer> set = new TreeSet<>();
//        set.add(12);
//        set.add(24);
//        set.add(36);
//        set.add(48);
//        set.add(72);
//        System.out.println(set);
//
//        // to remove the element in set
//        set.remove(48);
//        System.out.println(set);
//
//        // chack the value are belong or not
//        System.out.println(set.contains(37));
//
//        // chack the set is empty or not
//        System.out.println(set.isEmpty());
//
//        // chack the size of the Array
//        System.out.println(set.size());
//
//        // to clear the set
//        set.clear();
//        System.out.println(set);
    }
}
