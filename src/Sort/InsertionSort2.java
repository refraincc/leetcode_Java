package Sort;


import Sort.Sort;
import Tools.Integers;

public class InsertionSort2<E extends Comparable<E>> extends Sort<E> {
    

    /*
        1.在执行过程中，插入排序会将序列分为2个部分
            头部是已经排好序的，尾部是待排序的
        2.从头开始扫描每一个元素
            每当扫描到一个元素，就将它插入到头部合适的位置，使得头部数据依然保持有序

    */

    @Override
    protected void sort() {

        sort2();

    }


    void sort2() {

        for (int i = 1; i < array.length; i++) {

            int idx = 0;

            for (int j = 0; j < i; j++) {
                if (cmp(i, j) >= 0) {
                    idx = j + 1;
                    break;
                }                
            }
            
            for (int j = i; j > idx; j--) {
                swap(j - 1, j);
            }

        
        }
    }

    void sort1() {
        
        for (int i = 1; i < array.length; i++) {
           for (int j = i; j > 0; j--) {
                if (cmp(j, i) > 0) {
                    swap(i, j);
                }               
           }
        }
        
    }

    void sort3() {

        for (int i = 1; i < array.length; i++) {

            int length = i;
            int idx = binarySearchOf(length, i);
            // System.out.println(idx + "_");
            for (int j = i; j > idx; j--) {
                swap(j - 1, j);
                // System.out.println("swap：" + (j - 1) + " -> " + j);
                // Integers.println((Integer[])(array));
            }
            

        }


    }

    int binarySearchOf(int length, int targetIdx) {
        int begin = 0;
        int end = length;

        // System.out.println();

        int idx = 0;

        while (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            idx = mid;

            if (cmp(mid, targetIdx) <= 0) {
                begin = mid + 1;
            } else {
                end = mid;
            }
            idx = begin;

        }

        return idx;
    }


    public static void binarySearch(Integer[] array, int target) {

        
        int begin = 0;
        int end = array.length;

        int idx = 0;

        while (begin < end) {
            int mid = begin + ((end - begin) >> 1);
            

            System.out.println("mid =" + array[mid]);

            if (array[mid] < target) {
                begin = mid + 1;
            } else if (array[mid] > target) {
                end = mid;
            }else {
                begin = mid + 1;
            }
            idx = begin;

        }
        System.out.println(idx);
        
    }

    public static void main(String[] args) {
        
        // Integer[] array = {1, 4, 6, 7, 7, 7, 10, 22, 63, 100, 302};
        Integer[] array = {10};

        binarySearch(array, 7);


    }
}
