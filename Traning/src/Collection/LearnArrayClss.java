package Collection;

import java.util.Arrays;

public class LearnArrayClss {
    public static void main(String[] args) {
//        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//        // to searching the index in the position
//        int index = Arrays.binarySearch(numbers, 4);
//        Arrays.sort(numbers);
//
//        System.out.println("The numbers in the array in element 4 is " + index);

        Integer[] numbers = {1,11,30,4,5,60,7,8,19,10};
        Arrays.sort(numbers);

        for (int i : numbers){
            System.out.println(i + " ");
        }


    }
}
