package com.mydeenAbdul.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPath {

	public static void main(String[] args) {
//		String[] cities = new String[] {"BLR","CHN","DEL","HYD","KOL","MUM","VIZ"};
		List<String> cities = new ArrayList<>();
		cities.add("BLR");
		cities.add("CHN");
		cities.add("DEL");
		cities.add("HYD");
		cities.add("KOL");
		cities.add("MUM");
		cities.add("VIZ");
		int[][] dis = new int [][] {{0,2,4,2,2,3,-1},{8,0,5,2,-1,7,-1},{5,-1,0,9,4,3,-1},{8,5,7,0,6,-1,1},{-1,-1,3,6,0,4,7},{4,5,2,-1,4,0,-1},{-1,2,-1,1,6,-1,0}};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Start and End point");
		String s = sc.next(),e = sc.next();
		int min = Integer.MAX_VALUE;
		List<String> l = new ArrayList<>();
		List<String> res = new ArrayList<>();
		l.add(s);
		Queue<List<String>> q = new LinkedList<>();
		q.offer(l);
		while(!q.isEmpty()) {
			List<String> t = q.poll();
//			System.out.println(t);
			String last = t.get(t.size()-1);
			if(last.equals(e)) {
				int distance = 0;
				for(int i=1;i<t.size();i++) {
					int sP = cities.indexOf(t.get(i-1)),eP = cities.indexOf(t.get(i));
					distance += dis[sP][eP];
				}
				if(min>distance) {
					min=distance;
					res = t;
					continue;
				}
			}
			int pos = cities.indexOf(last);
			for(int i=0;i<cities.size();i++) {
				if(dis[pos][i]!=-1&&!t.contains(cities.get(i))) {
					List<String> t2 = new ArrayList<>(t);
					t2.add(cities.get(i));
					q.offer(t2);
				}
			}
		}
		min = res.size() == 0?0:min;
		System.out.println(min+" - "+res);
	}
}
