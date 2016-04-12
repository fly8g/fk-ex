package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmailCheck {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		str = br.readLine();
		if (isEmail(str)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	/**
	 * 邮箱地址合法性验证
	 * 满足以下条件视为合法
	 * 1.仅包含一个"@"字符
	 * 2.最后三个字符必须是".com"
	 * 3.字符之间没有空格
	 * 4.有效字符为1~9,a~z,A~Z,".","@","_"
	 * 
	 * @param email
	 * @return
	 */
	private static boolean isEmail(String email) {
		if (email == null || email.length() == 0) {
			return false;
		}
		if (email.lastIndexOf(".com") == -1) {
			return false;
		}
		if (!containsOneWord('@', email)) {
			return false;
		}
		if (!isValidWord(email)) {
			return false;
		}
		return true;
	}
	
	/**
	 * 验证str是否仅包含唯一一个字符c
	 * 
	 * @param c
	 * @param str
	 * @return
	 */
	private static boolean containsOneWord(char c, String str) {
		char[] array = str.toCharArray();
		int count = 0;
		for (char ch : array) {
			if (c == ch) {
				count++;
			}
		}
		return count == 1;
	}

	/**
	 * 验证str所含字符是否为
	 *  1~9,a~z,A~Z,".","@","_"
	 * 并且字符之间没有空格
	 * @param str
	 * @return
	 */
	private static boolean isValidWord(String str) {
		String dataDic = "123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ._@";
		char[] array = str.toCharArray();
		for (char ch : array) {
			if (dataDic.indexOf(ch) == -1) {
				return false;
			}
		}
		return true;
	}

}
