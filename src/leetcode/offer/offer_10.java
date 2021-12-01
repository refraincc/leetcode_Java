package Leetcode.offer;


public class offer_10 {

    /*
    一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。

    答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
    示例 1：
    输入：n = 2
    输出：2

    示例 2：
    输入：n = 7
    输出：21

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    */


    // 1, 2, 3, 4, 5, 6, 7
    // 1, 2, 3, 5, 8, 13, 21
    // f(n) = f(n - 1) + f(n - 2);
    static public int numWays(int n) {
        
        int j = 1;
        int k = j;
        for (int i = 1; i < n; i++) {
            int temp = k;
            k = (j + k) % 1000000007;
            j = temp;
        }

        return k;
    }


    public static void main(String[] args) {
        
        System.out.println(numWays(44));

    }


}
