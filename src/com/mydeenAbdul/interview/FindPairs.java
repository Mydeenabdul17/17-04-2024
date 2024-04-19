package com.mydeenAbdul.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindPairs {

	public static void main(String[] args) {
		double d = Math.ceil(17.77779);
		System.out.println(d);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of elements in  array ");
//		int n = sc.nextInt();
//		int[] nums = new int[n];
//		System.out.println("Enter the elements in array space seperated ");
//		int sum = 0, median = 0;
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//			sum += nums[i];
//		}
//		FindPairs f = new FindPairs();
//		double mean = (double) sum / (double) n;
//		median = f.findMedian(nums.clone());
//		List<List<Integer>> res = new ArrayList<>();
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				int s = nums[i] + nums[j];
//				if ((s > mean && s < median) || (s < mean && s > median)) {
//					List<Integer> l = new ArrayList<>();
//					l.add(nums[i]);
//					l.add(nums[j]);
//					res.add(l);
//				}
//			}
//		}
//		System.out.println(res);
	}

	private int findMedian(int[] nums) {
		Arrays.sort(nums);
		int n = nums.length, median;
		if (n % 2 == 0) {
			median = (nums[n / 2] + nums[(n / 2) - 1]) / 2;
		} else {
			median = nums[n / 2];
		}
		return median;
	}

}
