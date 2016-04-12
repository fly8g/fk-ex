package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DispBatteryLevel {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] levels = new int[n];
		for (int i = 0; i < n; i++) {
			levels[i] = Integer.parseInt(br.readLine());
		}
		String str1 = "+----------+";
		String str2 = "|----------|";
		String str3 = "|++++++++++|";
		String str4 = "===============";
		for (int j = 0; j < n; j++) {
			System.out.println(str1);
			for (int k = 0; k < 10 - levels[j]/10; k++) {
				System.out.println(str2);
			}
			for (int l = 0; l < levels[j]/10; l++) {
				System.out.println(str3);
			}
			System.out.println(str1);
			System.out.println(str4);
		}
	}

}
