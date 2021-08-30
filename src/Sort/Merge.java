package Sort;

import java.lang.reflect.Array;

import Sort.Sort;
import Tools.Integers;
import java.lang.Comparable;

public class Merge<E extends Comparable<E>> extends Sort<E> {

    private E[] temp;

    @Override
    protected void sort() {
        temp = (E[]) new Comparable[array.length >> 1];
        divide(0, array.length);
    }

    void divide(int begin, int end) {

        if (end - begin < 2)
            return;

        int mid = begin + ((end - begin) >> 1);

        divide(begin, mid);
        divide(mid, end);
        merge(begin, end, mid);
    }

    void merge(int begin, int end, int mid) {

        int li = 0;
        int length = mid - begin;
        int ri = mid;
        int re = end;
        int ai = begin;

        for (int i = li; i < length; i++) {
            temp[i] = array[begin + i];
        }

        while (li < length) {
            if (ri < re && cmp(array[ri], temp[li]) < 0) {
                array[ai++] = array[ri++];
            }else{
                array[ai++] = temp[li++];
            }
        }


    }

    void merge1(int begin, int end, int mid) {
        // {7, 3, 5, 8, 6, 7, 4, 5};
        int length = end - begin;
        System.out.println("length = " + length);
        Integer[] temp = new Integer[array.length >> 1];

        int left = begin;
        int right = mid;

        test(temp, left, right, mid, end);

        System.out.println("------temp-------");
        Integers.println(temp);
        System.out.println("------temp-------");

        for (int i = 0; i < length; i++) {
            array[begin + i] = (E) (temp[i]);
        }

        Integers.println((Integer[]) (array));
    }

    void test(Integer[] temp, int left, int right, int mid, int end) {
        for (int i = 0; i < temp.length; i++) {

            if (left >= mid && right < end) {
                temp[i] = (Integer) (array[right]);
                right++;
                continue;
            }

            if (right >= end && left < mid) {

                temp[i] = (Integer) (array[left]);
                left++;
                continue;
            }

            if (cmp(left, right) <= 0) {
                temp[i] = (Integer) (array[left]);
                left++;
                continue;
            }

            if (cmp(right, left) <= 0) {
                temp[i] = (Integer) (array[right]);
                right++;
                continue;
            }
        }
    }

    public static void main(String[] args) {

        Integer[] array = Integers.random(20, 0, 100);

    }

}
