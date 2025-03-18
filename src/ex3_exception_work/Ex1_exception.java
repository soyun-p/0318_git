package ex3_exception_work;

import java.util.Scanner;

public class Ex1_exception {
	public static void main(String[] args) {
		
		// 정수 : 10  (사용자 입력)
		// 입력받은 수 : 10
		
		// 정수 : a
		// 정수만 입력하세요.
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("입력 : ");
		
		try{
			int input = sc.nextInt();
			System.out.println("입력받은 수 : " + input);
			
		}catch( Exception e ) {
			System.out.println("정수만 입력하세요.");
		}
		
		
	
		
		
		
		
		
		
		
		
	} // main

}
