package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCMCompute {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		Long l1 = Long.parseLong(strs[0]);
		Long l2 = Long.parseLong(strs[1]);
		//System.out.println(maxCommonDivisor(l1, l2));
		System.out.println(minCommonMultiple(l1, l2));
		//System.out.println(minCommonMultiple2(l1, l2));
	}

	/**
	 * 求最大公约数
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	public static long maxCommonDivisor(long n, long m) {
		while (n % m != 0) {
			long temp = n % m;
			n = m;
			m = temp;
		}
		return m;
	}


	/**
	 * 求最小公倍数
	 * 
	 * @param n
	 * @param m
	 * @return
	 */
	private static long minCommonMultiple(long n, long m) {
		return n * m / maxCommonDivisor(n, m);
	}

	private static long minCommonMultiple2(long n, long m) {
		if (m < n) {
			long t = m;
			m = n;
			n = t;
		}
		for (long i = n; i <= m * n; i++) {
			if (i % m == 0 && i % n == 0) {
				return i;
			}
		}
		
		return -1;
	}
/**
5 7

35
 */
}
