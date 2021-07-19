

package Leetcode.dp;

/**
 * leetcode_1884
 * 
 * f(100) = (100 - x) + (x - 1) + 1;
 * 
 */
public class leetcode_1884 {

    static public int twoEggDrop(int n) {

        int count = 0;
        
        while (n > count) {
            
            count = n - count + count - 1 + 1;
        }

        System.out.println("result " + count);

        return 0;
    }

    // static public int max(int j, int k){

    // }
    

    public static void main(String[] args) {
        twoEggDrop(100);
    }
}