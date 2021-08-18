package Sort;

public class SelectionSort<E extends Comparable<E>> extends Sort<E>{


    /*
        1.从序列中找出最大的那个元素，然后与最末尾的元素交换位置，
            执行一轮完成后，最末尾的那个元素就是最大的元素
        2.忽略1中曾经找到的最大元素，重复执行1
    */

    @Override
    protected void sort() {
        
        for (int i = array.length; i > 0; i--) {
            int maxIdx = 0;
            for (int j = 1; j < i; j++) {
                if (cmp(j, maxIdx) > 0) {
                    maxIdx = j;
                }
            }
            swap(maxIdx, i - 1);
        }


    }

}
