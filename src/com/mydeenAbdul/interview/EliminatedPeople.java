package com.mydeenAbdul.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class EliminatedPeople {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of people ");
		int n = sc.nextInt();
		System.out.println("Enter the X value");
		int x = sc.nextInt();
		Queue<Integer> q = new LinkedList<>();
		List<Integer> res = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			q.offer(i);
		}
		while(x>0&&q.size()>=x) {
			int s = q.size();
			for(int i=1;i<=s;i++) {
				int t = q.poll();
				if(i%x!=0) {
					q.offer(t);
				}else {
					res.add(t);
					break;
				}
			}
		}
		System.out.println(res);
	}
}
