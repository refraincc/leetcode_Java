package Sort;

import Sort.Sort;

public class BubbleSort3<E extends Comparable<E>> extends Sort<E>  {
 
    @Override
    protected void sort() {
        
        sort1();
        
    }

    private void sort2(){
        for (int i = array.length - 1; i > 0; i--) {
            boolean sorted = true;
            int sortedIndex = 1;
            for (int j = 1; j <= i; j++) {
                if (cmp(j, j - 1) < 0) {
                    swap(j, j - 1);
                    sortedIndex = j;
                    sorted = false;
                }
            }
            i = sortedIndex;
            if (sorted == true) {
                break;
            }
        }
    }
    //如果序列尾部已经局部有序，可以记录最后一次交换的位置，减少比较次数
    private void sort1(){
        for (int i = array.length - 1; i > 0; i--) {
            int sortedIndex = 1;
            for (int j = 1; j <= i; j++) {
                if (cmp(j, j - 1) < 0) {
                    swap(j, j - 1);
                    sortedIndex = j;
                }
            }
            i = sortedIndex;
        }
    }

}
