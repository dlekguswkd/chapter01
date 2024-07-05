package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		
		// dan 단 (2->9)
		for(int dan=2; dan<=9; dan++) {
			//System.out.println();
			
			// i (1->9)
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + "=" + dan*i);
			}
		}
	}
}
