package ex10_thread_work;

import java.util.Scanner;

public class TMain {
	public static void main(String[] args) {
		
		// 메인에서 입력받은 정수를 스레드를 상속받고 있는 클래스B에서 1초에 1씩 감소시키면서 출력.
		
		// 값 : 5
		// 5
		// 4
		// 3
		// 2
		// 1 
		// 0
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값 : ");
		int n = sc.nextInt();
		
		ThreadA ta = new ThreadA();
		ta.setN(n);
		ta.start();
		
		
	} // main

}
