package com.mydeenAbdul.interview;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {

	static int start = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Expression ");
		String exp = sc.nextLine();
		for (int i = exp.length() - 1; i >= 0; i--) {
			if (exp.charAt(i) == ')') {
				System.out.println(solve(exp, i - 1));
				i = start;
			}
		}
	}

	private static int solve(String exp, int i) {
		Stack<Integer> s = new Stack<>();
		for (int j = i; j >= 0; j--) {
			if (exp.charAt(j) == ' ') {
				continue;
			}
			if (exp.charAt(j) == '(') {
				start = j;
				return s.pop();
			} else if (exp.charAt(j) == ')') {
				s.push(solve(exp, j - 1));
				j = start;
			} else if (Character.isDigit(exp.charAt(j))) {
				String n = "";
				while(exp.charAt(j)!= ' ') {
					n = exp.charAt(j)+n;
					j--;
				}
				s.push(Integer.parseInt(n));
			} else {
				if (exp.charAt(j) >= 'a' && exp.charAt(j) <= 'z') {
					switch (exp.substring(j - 2, j + 1)) {
					case "add": {
						int sum = 0;
						while (s.size() > 0) {
							sum += s.pop();
//							System.out.print(sum);
						}
						s.push(sum);
						break;
					}
					case "sub": {
						int a = s.pop(), b = s.pop();
						s.push(a - b);
						break;
					}
					case "div": {
						int a = s.pop(), b = s.pop();
						s.push(a / b);
						break;
					}
					case "mul": {
						int mul = 1;
						while (s.size() > 0) {
							mul *= s.pop();
						}
						s.push(mul);
						break;
					}
					}
					j -= 2;
				}
			}
		}
		return s.pop();
	}
}
