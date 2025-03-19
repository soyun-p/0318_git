package ex13_homework;

import java.util.Random;
import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		 
		// 1~100 사이의 난수 두 개를 더하는 문제 출제
		// 키보드에서 답을 입력받고, 다섯문제가 정답처리 됐을 때 프로그램 종료
		// 시작부터 종료시까지 경과 시간 출력
		
		// 23 + 48 = 71
		// 정답!
		//68 + 52 = 1(답은 입력받기)
		// 오답
		// ......
		// 53 + 28 = 81
		// 정답
		// 결과 : 24초...
		
		
		int count = 0;  // 정답 갯수 세는 변수
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		
		TimeThread tt =new TimeThread();
		tt.start();
		
		
		while( true ) {
			int n1 = rnd.nextInt(100) + 1;
			int n2 = rnd.nextInt(100) + 1;
			System.out.printf("%d + %d = ", n1, n2);
			
			int res = sc.nextInt();
			
			
			// 정,오답 판단
			if( res == n1 + n2 ) {
				System.out.println("정답!!");
				count++;
			}else {
				System.out.println("오답...");
			}
			
			
			// 게임 종료 여부
			if( count == 2 ) {
				tt.setPlaying(false);  // isPlaying이 false이므로 타임스레드의 while문을 종료한다.
				System.out.println("결과 : " + tt.getTimer() +  "초");
				break;
			}
			
			
			
		} // while
	
		
		
		
		
		

		
		
		
	} //  main

}
