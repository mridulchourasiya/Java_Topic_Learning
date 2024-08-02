package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {


        // you can't add a 30 in value because the array is 0 to 29
//        String[] studentsName = new String[30];
//        studentsName[0] = "Rakehs";
//
//
//       // studentsName[1]...studentsName[28];
//        studentsName[29]= "jay";
//
//        // add a new student
//        studentsName[30] = "ram";


        // Array List class
      //  ArrayList<String>studentsName = new ArrayList<>();


        // if the size is n to increment size is  n + n/2 + 1

       // studentsName.add("Mohit");

        // add functionality
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        System.out.println(list);
//
//        // add the element in array list in index
//        list.add(1, 45);
//        list.add(9);
//
//
//
//        System.out.println(list);
//        // get an element in arraylist
//        System.out.println(list.get(1));

  // how to remove element in array Arraylist
  List<Integer> list = new ArrayList<>();
  list.add(10);
  list.add(20);
  list.add(30);
  list.add(40);
  list.add(50);
  list.add(60);

        System.out.println(list);

      list.remove(1);
        list.remove(Integer.valueOf(30));
        System.out.println(list);

//     list.clear();
//        System.out.println(list);


     list.set(2, 2000);
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            System.out.println("the element is "+ list.get(i));
        }

        for (Integer element : list){
            System.out.println("foreach element "+ element);
        }


        // iterator for element
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterator"+ it.next());
        }


    }





}
