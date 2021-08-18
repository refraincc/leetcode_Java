package Sort;

import java.util.Arrays;

import Sort.BubbleSort1;
import Sort.BubbleSort2;
import Sort.BubbleSort3;
import Sort.Sort;
import Tools.*;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class SortMain {
    

    public static void main(String[] args) {
        
        Integer[] array = Integers.random(10000, 0, 50000);

        testSorts(array, 
                new BubbleSort1(),
                new BubbleSort2(),
                new BubbleSort3()
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
