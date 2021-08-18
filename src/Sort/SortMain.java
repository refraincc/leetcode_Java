package Sort;

import java.util.Arrays;

import Sort.BubbleSort;
import Sort.Sort;
import Tools.*;

@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class SortMain {
    

    public static void main(String[] args) {
        
        Integer[] array = Integers.random(20000, 0, 20000);

        testSorts(array, 
                new BubbleSort()

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
