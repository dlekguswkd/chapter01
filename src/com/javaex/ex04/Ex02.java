package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 초기값 조건식 증감식
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("단:");		//dan은 단
		
		int dan = sc.nextInt();
		int i=1;		//i는 index? 반복되는 횟수(초기값)
		
		while(i<=9) {
			System.out.println(dan + "*" + i + "=" + dan*i);
			
			i++;
		}
		sc.close();	
	}

}
