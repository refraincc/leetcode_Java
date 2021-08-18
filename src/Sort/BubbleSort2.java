package Sort;

public class BubbleSort2<E extends Comparable<E>> extends Sort<E> {
    
    
    @Override
    protected void sort() {
        
        for (int i = array.length - 1; i >= 0; i--) {
            boolean isSort = true;
            for (int j = 1; j <= i; j++) {
                if (cmp(array[j], array[j - 1]) < 0) {
                    swap(j, j - 1);
                    isSort = false;
                }
            }
            //如果序列已经完全有序，可以提前终止冒泡排序
            if (isSort == true) {
                break;
            }
        }


    }


}
