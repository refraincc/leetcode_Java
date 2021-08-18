package Sort;

import Tools.Integers;
import Sort.Sort;

public class BubbleSort<E extends Comparable<E>> extends Sort<E> {
    

    @Override
    protected void sort() {

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (cmp(array[j], array[j - 1]) < 0) {
                    E tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
    }
    
}
