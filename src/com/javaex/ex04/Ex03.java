package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단:");
		
		int dan =sc.nextInt();
		int time= 1;
		
		//초기값 조건식 증감식
		for(int i=0; i<9; i++) {
			System.out.println(dan + "*" + time + "=" + dan*time);
			time++;
		}
		sc.close();
		
	}

}
