package com.javaex.ex01;

//클래스
public class Ex07 {
	
	//매소드
	public static void main(String[] args) {
		
		//일방적인 방식
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값을 변경
		pi = 3.1415926;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		
		//////////////////////////
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
		//PI값을 변경(final을 쓰면 오류가 남)
		//PI = 3.1415926;   상수로 선언되서 바꿀수 없다
		
		
		
	}

}
