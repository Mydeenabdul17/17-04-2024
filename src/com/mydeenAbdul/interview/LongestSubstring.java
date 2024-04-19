package com.mydeenAbdul.interview;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of String ");
		int n = sc.nextInt();
		String[] strs = new String[n];
		System.out.println("Enter Strings with space seperated ");
		for (int i = 0; i < n; i++) {
			strs[i] = sc.next();
		}
		String res = "()";
		int i = 0, j = 3;
		while (j <= strs[0].length()) {
			String key = strs[0].substring(i, j);
			boolean b = true;
			for (int k = 1; k < n; k++) {
				if (!strs[k].contains(key)) {
					b = false;
					break;
				}
			}
			if (b) {
				j++;
				res = res.length() < key.length() ? key : res;
			} else {
				i++;
				j = i + 3;
			}
		}
		System.out.println(res);
	}
}
