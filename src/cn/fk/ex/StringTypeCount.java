package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringTypeCount {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(",");
		int a = Integer.parseInt(strs[0]);
		if (a <= 20 && strs[1].length() == a) {
			char[] n = strs[1].toCharArray();
			int[] b = new int[a];
			Arrays.fill(b, 1);
			String dataDic = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for (int i = 0; i < a - 1; i++) {
				if (dataDic.indexOf(n[i]) == -1) {
					b[i] = 0;
					continue;
				}
				for (int j = i + 1; j < a; j++) {
					if (n[i] == n[j] && b[i] != 0) {
						b[i]++;
						b[j] = 0;
					}
				}
			}
			int cnt = 0;
			for (int m = 0; m < a; m++) {
				if (b[m] > 0) {
					++cnt;
				}
			}
			System.out.println(cnt);
		}
	}
/**
6,abaaal

3
*/
}
