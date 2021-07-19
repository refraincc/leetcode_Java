package Leetcode.Offer;

import java.lang.reflect.Array;
import java.util.Iterator;

public class offer_03 {
	/// ԭ�������
	static public int findRepeatNumber(int[] nums) {

		if (nums.length == 0)
			return -1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == nums[nums[i]] && nums[i] != i) {
				return nums[i];
			}

			int temp = nums[nums[i]];
			nums[nums[i]] = nums[i];
			nums[i] = temp;

		}

		return -1;

	}

	/// ����ȫ�µ�����
	public int findRepeatNumber2(int[] nums) {

		int[] array = new int[nums.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}

		for (int i = 0; i < nums.length; i++) {
			if (array[nums[i]] == nums[i]) {
				return nums[i];
			} else {
				array[nums[i]] = nums[i];
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("solution start");

		int[] array = new int[] { 0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		int number = findRepeatNumber(array);

		System.out.println(number);

		System.out.println("solution end");
	}

}
