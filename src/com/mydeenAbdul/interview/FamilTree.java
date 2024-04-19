package com.mydeenAbdul.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class FamilTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> m = new HashMap<>();
		System.out.println("Enter the number of entry");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name");
			String name = sc.nextLine();
			List<String> parents = new ArrayList<>();
			System.out.println("Enter Mother Name");
			parents.add(sc.nextLine());
			System.out.println("Enter Father Name");
			parents.add(sc.nextLine());
			m.put(name, parents);
		}
		System.out.println("Enter the input");
		String input = sc.nextLine();
		List<String> par ;
		if(m.containsKey(input)) {
			boolean found = true;
			par = m.get(input);
			while(found) {
				found = false;
				for (Map.Entry<String, List<String>> entry : m.entrySet()) {
					String key = entry.getKey();
					List<String> val = entry.getValue();
					if(val.contains(input)) {
						
					}
				}
			}
		}
	}
}
