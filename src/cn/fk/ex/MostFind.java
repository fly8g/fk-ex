package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MostFind {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] n = new int[10];
		for (int i = 0; i < 10; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		
		int[] b = {1,1,1,1,1,1,1,1,1,1};
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (n[i] == n[j] && b[i] != 0) {
					b[i]++;
					b[j] = 0;
				}
			}
		}
		int max = b[0];
		for (int k = 1; k < 10; k++) {
			max = max > b[k] ? max : b[k];
		}
		String outStr = "";
		for (int m = 0; m < 10; m++) {
			if (b[m] == max) {
				if (outStr.length() > 0) {
					outStr += ",";
				}
				outStr = outStr + n[m];
			}
		}
		System.out.println(outStr);
	}
/**
1
2
3
4
5
6
6
7
8
9

6
*/
}
