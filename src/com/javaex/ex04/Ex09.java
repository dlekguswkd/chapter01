package com.javaex.ex04;

public class Ex09 {

	public static void main(String[] args) {
		
		int no =1;
		
		while(true) {
			if(no%6==0 && no%14==0) {  // no가 6의 배수, no가 14의 배수 둘다 동시에 만족하면
				System.out.println(no);
				break;
			}
			no++;
		}

	}

}
