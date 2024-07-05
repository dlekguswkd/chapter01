package com.javaex.ex02;

//클래스
public class Ex01 {

	// 메소드
	public static void main(String[] args) {

		System.out.println("안녕");
		System.out.println("하세요");

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println("-------------");

		int i = 2345;
		double d = 3.14;
		char c = '한'; // 실제값을 가지고 있다
		String s = "한"; // 주소를 가지고 있다
		String str = "굿모닝";
		String name = "이다현";

		System.out.println(str);
		System.out.println(str + str); // 숫자가 아닌 글자는 그냥 뒤에 붙는다
		System.out.println(i + i);     // 숫자라서 우리가 아는 더하기를 한다
		System.out.println(i + d);     // 정수 + 실수  -> 정수(자동형변환->실수) + 실수
		System.out.println(str + i);   // 계산이 안되므로 문자처럼 뒤에 붙임
		
	   String str2 = str + i;     //문자열 + 숫자(실수, 정수)  -> 문자열
	   
	   
	   //굿모닝랑이다현
	   System.out.println(str + "랑" + name);
	   
	   //굿모닝 이다현
	   System.out.println(str + " " + name);
	   
	   //제이름은 이다현입니다.
	   System.out.println("제이름은 " + name + "입니다.");
	   
	   //char형은 + 연산자가 더하기로 계산됨
	   System.out.println(c);       // 한 
	   System.out.println(c + c);   // 코드값으로 받아들여서 숫자로 바뀜
	   
	   System.out.println("-----------");
	   
	   // 제이름은 "황일영"입니다. 
	   System.out.println("제이름은 \"" + name + "\"입니다.");  //여기에서 \는 돈모양임 
	   
	   // 제이름은 \이다현\ 입니다.
	   System.out.println("제이름은 \\" + name + "\\ 입니다.");
	   
	   // 제이름은     이다현입니다.
	   System.out.println("제이름은\t" + name + "입니다.");
	   
	   // 제이름은
	   // 이다현 입니다.
	   System.out.println("제이름은");
	   System.out.println(name + "입니다.");
	   
	   System.out.println("제이름은\n" + name + "입니다.");
	   
	}

}
