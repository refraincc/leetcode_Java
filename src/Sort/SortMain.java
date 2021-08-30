package Sort;

import java.util.Arrays;

import Sort.BubbleSort1;
import Sort.BubbleSort2;
import Sort.BubbleSort3;
import Sort.SelectionSort;
import Sort.InsertionSort1;
import Sort.InsertionSort2;
import Sort.InsertionSort3;
import Sort.*;
import Tools.*;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class SortMain {
    

    public static void main(String[] args) {
        
        Integer[] array = Integers.random(20000, 0, 50000);
        // Integer[] array = {7, 3, 5, 8, 6, 7, 4, 5};

        testSorts(array, 
                new BubbleSort1(),
                new BubbleSort2(),
                new BubbleSort3(),
                new SelectionSort(),
                // new InsertionSort1(),
                // new InsertionSort2(),
                new InsertionSort3(),
                new Merge()
        );



    }


    static void testSorts(Integer[] array, Sort... sorts) {

        for (Sort sort : sorts) {
            Integer[] newArray = Integers.copy(array);
            sort.sort(newArray);
            Asserts.test(Integers.isAscOrder(newArray));
        }

        Arrays.sort(sorts);

        for (Sort sort : sorts) {
            System.out.println(sort);
        }

    }



}
