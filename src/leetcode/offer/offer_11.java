package Leetcode.offer;

public class offer_11 {
    
    static public int minArray(int[] numbers) {

        int minNum = numbers[0];

        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int mid = (right + left) / 2;
            System.out.println("left = " + left + "mid = " + mid +  "right = " + right);
            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right--;
            }
    
        }
        return numbers[left];

    }
    public int minArray2(int[] numbers) {

        int minNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                return numbers[i];
            }
        }

        return minNum;

    }

    public static void main(String[] args) {
        // int[] nums = {2,2,2,0,1};
        // int[] nums = {3,4,5,1,2};
        // int[] nums = {0};
        int[] nums = {10, 1, 10, 10, 10};
        System.out.println("begin");
        System.out.println(minArray(nums));
        System.out.println("end");
    }

}
