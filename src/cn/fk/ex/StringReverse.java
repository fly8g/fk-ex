package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		str = br.readLine();
		System.out.println(reverse1(str));
		System.out.println(reverse2(str));
	}

	/**
	 * 将字符串str交换前后顺序后输出
	 * @param str
	 * @return
	 */
	private static String reverse1(String str) {
		char[] array = str.toCharArray();
		int len = str.length();
		String retStr = "";
		for (int i = len - 1; i >= 0; i--) {
			retStr += array[i];
		}
		return retStr;
	}

	private static String reverse2(String str) {
		return new StringBuffer(str).reverse().toString();
	}
}
