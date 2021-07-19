package Leetcode.Offer;

/*
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * ��ʵ��һ�����������ַ��� s �е�ÿ���ո��滻��"%20"��
 * ʾ�� 1��
	���룺s = "We are happy."
	�����"We%20are%20happy."
 * */
public class offer_05 {

	static public String replaceSpace(String s) {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ') {
				stringBuffer.append("%20");
			} else {
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
