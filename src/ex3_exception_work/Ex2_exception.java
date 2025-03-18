package ex3_exception_work;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2_exception {
	public static void main(String[] args) {

		// 나누기 연산만을 수행하는 계산식을 만들고 아래 결과 출력

		// 수1 : 10
		// 수2 : 2
		// 결과 : 10 / 2 = 5

		// 수1 : 1
		// 수2 : 0
		// 결과 : 0으로 나눌 수 없습니다.

		// 수1 : a
		// 오류 : 정수가 아닙니다.


		Scanner sc = new Scanner(System.in);

		
		

		try {
			System.out.print("수1 : ");
			int n1 = sc.nextInt();

			System.out.print("수2 : ");
			int n2 = sc.nextInt();
			
			int result = n1 / n2;
			
			System.out.printf("결과 : %d / %d = %d\n", n1, n2, result);

			
		}catch( ArithmeticException e ) {
			System.out.println("결과 : 0으로 나눌 수 없습니다.");
	
		}catch( InputMismatchException e ) { // 입력 미스매치 오류
			System.out.println("오류 : 정수가 아닙니다.");
		}
			
		

		
		
			
		



	} // main

}
