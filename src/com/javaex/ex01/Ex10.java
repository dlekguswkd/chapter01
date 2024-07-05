package com.javaex.ex01;

//클래스
public class Ex10 {
	
	//메소드
	public static void main(String[] args) {
	
		//대입연산자 =
		int a = 7;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-------------");
		
		//산술연산자
		int sum = a+b;
		System.out.println(sum);
		System.out.println(a+b);   // +
		System.out.println(a-b);   // -
		System.out.println(a*b);   // *
		System.out.println(a/b);   // /  -> 몫
		System.out.println(a%b);   // %  -> 나머지
		
		//산술연산자 -> 자세히
		System.out.println(7/2);     // 3
		System.out.println(7.0/2);   // 3.5
		System.out.println(7.0/2.0); // 3.5
		
		System.out.println("-------------");
		
		//부호연산자
		int var = -3;
		int pVar = +var;   // +(-3)  -> -3
		int mVar = -var;   // -(-3)  -> +3
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		System.out.println("-------------");
		
		//증감연산자
		System.out.println(a);    // 7
		System.out.println(++a);  // 7 -> 8
		System.out.println(a);    // 값을 출력한다 8
		
		System.out.println(b);    // 2
		System.out.println(--b);  // 2 -> 1
		System.out.println(b);    // 값을 출력한다 1
		
		System.out.println("-------------");
		System.out.println(a);    // 8
		System.out.println(a++);  // 8 출력, 8 -> 9
		System.out.println(a);    // 9 출력
		
		System.out.println(b);    // 1
		System.out.println(b--);  // 1 출력, -1(맨마지막에 해야됨) 1 -> 0
		System.out.println(b);    // 0 출력
		
		System.out.println("-------------");
		int c = 5;
		System.out.println(++c*2);  // 5+1=6, 6*2= 12  12 출력
		System.out.println(c);      // 6
		
		int d = 5;
		System.out.println(d++*2);  // 5*2=10, 10 출력, 5+1=6 
		System.out.println(d);      // 6
		
		
	}

}
