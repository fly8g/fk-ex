package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreCompute {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		if (strs.length > 3) {
			int i1 = Integer.parseInt(strs[0]);
			int i2 = Integer.parseInt(strs[1]);
			int i3 = Integer.parseInt(strs[2]);
			int i4 = Integer.parseInt(strs[3]);
			if (validateNum(i1) && validateNum(i2) && validateNum(i3) && validateNum(i4)) {
				int sum = i1 + i2 + i3 + i4;
				int avg = sum / 4;
				System.out.println(sum + " " + avg);
			}
		}
	}
	
	private static boolean validateNum(int i) {
		return i >= 0 && i <= 150;
	}
/**
80 90 80 90

340 85
*/
}
