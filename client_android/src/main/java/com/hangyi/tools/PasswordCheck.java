package com.hangyi.tools;


/**
 * @author Administrator
 *
 */
public class PasswordCheck {
	/**
	 *  密码必须包含数字与字母8位到20位
	 */
	public static boolean isLetterDigit(String str) {
		boolean isDigit = false;// 定义一个boolean值，用来表示是否包含数字
		boolean isLetter = false;// 定义一个boolean值，用来表示是否包含字母
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) { // 用char包装类中的判断数字的方法判断每一个字符
				isDigit = true;
			} else if (Character.isLetter(str.charAt(i))) { // 用char包装类中的判断字母的方法判断每一个字符
				isLetter = true;
			}
		}
		String regex = "^[a-zA-Z0-9]{8,20}$";
		boolean isRight = isDigit && isLetter && str.matches(regex);
		return isRight;
	}

	public static void main(String[] args) {
		System.out.println(isLetterDigit(""));
		System.out.println(isLetterDigit("11111"));
		System.out.println(isLetterDigit("11111111111"));
		System.out.println(isLetterDigit("aaa"));
		System.out.println(isLetterDigit("aaaaaaaaaaaaa"));
		System.out.println(isLetterDigit("a1"));
		System.out.println(isLetterDigit("Aaaaaaaaa1"));
		System.out.println(isLetterDigit("a11111111111"));
	}
}
