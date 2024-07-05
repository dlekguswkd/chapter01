package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		
		//가상의 y축위치
		for(int y=1; y<=6; y++) {
					
			// x축  가로출력 (별 찍는횟수)
			for(int x =1; x<=y; x++) {
				System.out.print("*");
			}
			//진짜 줄바꿈
			System.out.println("");
		}
	}

}
