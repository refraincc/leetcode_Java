package Sort;

import Sort.Sort;

public class InsertionSort<E extends Comparable<E>> extends Sort<E> {
    

    /*
        1.在执行过程中，插入排序会将序列分为2个部分
            头部是已经排好序的，尾部是待排序的
        2.从头开始扫描每一个元素
            每当扫描到一个元素，就将它插入到头部合适的位置，使得头部数据依然保持有序

    */

    @Override
    protected void sort() {
        
        for (int i = 1; i < array.length; i++) {

            int left = 0;
            int right = i;

            while (left < right) {
                int mid = (left + right) >> 1;

                if (cmp(mid, right) > 0) {
                    left = mid;
                }

            }
        }
        
    }

}
