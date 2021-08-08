package Leetcode.offer;


public class offer_04 {

	static public boolean findNumberIn2DArray(int[][] matrix, int target) {

		int i = matrix.length - 1;
		int j = 0;

		while (i >= 0 && j < matrix[0].length) {

			if (target < matrix[i][j]) {
				i--;
			} else if (target > matrix[i][j]) {
				j++;
			} else {
				return true;
			}
		}

		return false;

	}

	static public boolean findNumberIn2DArray2(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix == null || matrix[0].length == 0) {
			return false;
		}

		for (int i = 0; i < matrix.length; i++) {

			int[] subArray = matrix[i];
			int subCount = subArray.length - 1;
			if (subArray[0] > target || subArray[subCount] < target) {
				continue;
			}

			int low = 0;
			int hig = subArray.length - 1;
			while (low <= hig) {

				int mid = (hig + low) >> 1;

				System.out.println(low + "," + mid + "," + hig);

				if (subArray[mid] < target) {
					low = mid + 1;
				} else if (target < subArray[mid]) {
					hig = mid - 1;
				} else {
					return true;
				}
			}

		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("solution start");

		int[][] array = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
				{ 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
		// int[][] array = new int[][] {{}};
		boolean number = findNumberIn2DArray2(array, 20);

		System.out.println(number);

		System.out.println("solution end");
	}

}
