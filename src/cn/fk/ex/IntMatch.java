package cn.fk.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IntMatch {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = null;
		String str2 = null;
		str1 = br.readLine();
		str2 = br.readLine();
		String[] strs = str1.split(",");
		List<String> a1 = Arrays.asList(strs);
		List<String> a2 = new ArrayList<String>();
		for (String a1i : a1) {
			if (a1i.indexOf(str2) != -1) {
				a2.add(a1i);
			}
		}
		if (!a2.isEmpty()) {
			Collections.sort(a2, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
				}
			});
			String out = "";
			for (String str : a2) {
				if (out != "") out += ",";
				out += str;
			}
			System.out.println(out);
		} else {
			System.out.println("null");
		}
	}
/**
 * 1214,2124,5125,5412,1548,1658
 * 12
 * 1214,2124,5125,5412
 * 
 * 12345,654123,98764,123654,9876,4,6,97,8,123
 * 123
 * 123,12345,123654,654123
 */
}
