package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppleShare {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		str = br.readLine();
		String[] strs = str.split(" ");
		int i1 = Integer.parseInt(strs[0]);
		int i2 = Integer.parseInt(strs[1]);
		if (i1 >=0 && i1 <= 10
				&& i2 >=0 && i2 <= 10) {
			System.out.println("" + shareApple(i1, i2));
		}
	}
	
	private static int shareApple(int m, int n) {
		int a = 0;
		if (n <= 1) {
			return 1;
		}
		for (int i = m; i >= 0; i -= n) {
			a += shareApple(i, n-1);
		}
		return a;
	}

}
