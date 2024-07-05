package com.javaex.ex04;

public class Ex13 {

	public static void main(String[] args) {
		/*
		int i=1;
		while (true) {
			
			if (i>3) {				
				break;				// 놀던아이 내쫒기
			}
			System.out.println(i);
			i++;
		}
		*/
		//돌다가 나가는게 아니라 아예 못들어가게하는거 
		int i =1;
		boolean flag =true;
		
		while (flag) {
			
			if(i>3) {
				flag = false;   //밑에꺼까지 함 ,다음에 아예 못들어옴
				//break;
			}
			System.out.println(i);
			i++;
		}
	}

}
