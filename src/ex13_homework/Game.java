package ex13_homework;

import java.util.Random;
import java.util.Scanner;

public class Game extends Thread{


	int timeCount = 0; // 얼마나 지났는지 세는 변수
	int answerCount = 0;  // 정답을 맞춘 문제를 세는 변수

	Random ran = new Random();

	Scanner sc = new Scanner(System.in);
	int input;

	@Override
	public void run() {

		out:while( answerCount < 5 ) {

			int n1 = ran.nextInt(100) + 1;
			int n2 = ran.nextInt(100) + 1;
			
			int answer = n1 + n2;

			System.out.printf("%d + %d = ", n1, n2);
			input = sc.nextInt();

			try {
				Thread.sleep(1000);
				timeCount++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			if( input == answer ) {
				answerCount++;
				System.out.println("정답!");
				continue;
			}else {
				System.out.println("오답");
				continue;
			}
			
			
		} // while
		
		
		System.out.printf("결과 : %d 초...\n", answerCount);
			





	} // run()





}
