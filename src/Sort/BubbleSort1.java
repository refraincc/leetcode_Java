package Sort;

import Tools.Integers;
import Sort.Sort;

public class BubbleSort1<E extends Comparable<E>> extends Sort<E> {
    

    @Override
    protected void sort() {

        /*
            1 从头开始比较每一对相邻元素，如果第1个比第2个大，就交换它们的位置 
                ✓ 执行完一轮后，最末尾那个元素就是最大的元素
            2 忽略 1 中曾经找到的最大元素，重复执行步骤 1，直到全部元素有序
        */

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (cmp(array[j], array[j - 1]) < 0) {
                    swap(j, j - 1);
                }
            }
        }
        
    }
    
}
