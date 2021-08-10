package Sort;

import Tools.Integers;

public class bubbleSort {
    

    static Integer[] bubbleSort(Integer[] array) {
        
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (array[j] < array[j - 1]) {
                    Integer tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = Integers.random(10, 0, 200);
        Integers.println(array);
        System.out.println("------");
        Integers.println(bubbleSort(array));
    }

}
