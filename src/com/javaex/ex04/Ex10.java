package com.javaex.ex04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요.");
			int no = sc.nextInt();
			
			if (no==0){					//no가 0이면 끝
				System.out.println("종료");
				break;					// 가장 가까운 반복문 1개를 탈출한다
			}
			if(no%3==0) {			// no가 3의 배수인지 판단
				System.out.println("3의 배수입니다.");
			}else{
				System.out.println("3의 배수가 아닙니다.");
				
			}
		}
		sc.close();
	}

}
