package ex3_exception_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3_exception_check {
	public static void main(String[] args) {

		// 정수 : 100  (사용자 입력)
		// 결과 : 100  (출력)

		// 정수 : aaa
		// aaa은(는) 정수가 아닙니다.


		Scanner sc = new Scanner(System.in);
        
		System.out.println("정수 : ");
		
		String input = sc.next();  // catch 문에서도 input을 출력할 수 있도록 전역 변수로 선언.
		
		try {
			
			int num = Integer.parseInt(input); // 문자열을 정수로 바꿔준다.
					
			System.out.println("결과 : " + num);

		}catch( Exception e ) {
			System.out.println( input + "은(는) 정수가 아닙니다.");
		}





	} // main

}
