package offer;

/*
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
	输入：s = "We are happy."
	输出："We%20are%20happy."
 * */
public class offer_05 {
	
	static public String replaceSpace(String s) {

		StringBuffer stringBuffer = new StringBuffer();
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ' ') {
				stringBuffer.append("%20");
			}else {
				stringBuffer.append(s.charAt(i));
			}
			
			
		}
		
		return stringBuffer.toString();
		
	}
	

	public static void main(String[] args) {

		System.out.println("solution start");
		System.out.println(replaceSpace("We are Happy"));
		System.out.println("solution end");

	}

}
