package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitReset {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		str = br.readLine();
		String[] strs = str.split(" ");
		int i1 = Integer.parseInt(strs[0]);
		int i2 = Integer.parseInt(strs[1]);
		if (i2 >=0 && i2 <= 31) {
			int temp = i1;
			temp &= ~(1 << i2);
			temp |= (1 << i2);
			i1 = temp;
			System.out.println(i1);
		}
	}
/**
891 7

1019
*/
}
