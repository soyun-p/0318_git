package ex9_runnable;

import java.util.Random;

public class Thread1 extends Random implements Runnable{
	
	int n = this.nextInt(5);  // this == super : 일맥상통함.

	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("스레드 실행중" + i);
		}
		
	} // run

}
