package offer;

public class offer_04 {

	static public boolean findNumberIn2DArray(int[][] matrix, int target) {
		
		if (matrix.length == 0) {
			return false;
		}
		
		int i = 0;
		int length = matrix.length;
		
		while (i < length) {
			if (matrix[i].length == 0) {
				i++;
				continue;
			}
			i++;
			int middle = length >> 1 + 1;
			int subArrayFirstObject = matrix[middle][0];
			if (subArrayFirstObject < target) {
				length = middle + middle / 2;
			}else if (target < subArrayFirstObject) {
				length = middle - middle / 2;
			}else {
				return true;
			}
			int j = 0;
			int subLength = matrix[i].length; 
			while (j < subLength) {
				j++;
				int subMiddle = subLength >> 1 + 1;
				int subObject = matrix[middle][subMiddle];
				
				if (subObject < target) {
					subLength = subMiddle + subMiddle / 2;
				}else if (target < subObject) {
					subLength = subMiddle - subMiddle / 2;
				}else {
					return true;
				}
				
			}
			
		}
		
		
		return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("solution start");
		
		int[][] array = new int[][] {{1,  4,  7, 11, 15},{2,   5,  8, 12, 19}, {3,   6,  9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
//		int[][] array = new int[][] {{}};
		boolean number = findNumberIn2DArray(array, 7);
		
		System.out.println(number);
		
		System.out.println("solution end");
	}

}
