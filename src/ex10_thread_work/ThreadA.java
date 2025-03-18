package ex10_thread_work;

import java.util.Set;

public class ThreadA extends Thread {
	
	private int n;
	
	/* 생성자로 인자 받는 방식
	 * public ThreadA( int n ) { // setter로도 값을 보낼 수 있다.
		
		this.n = n;
	} */
	
	
	public void setN(int n) {
		this.n = n;
	}
	
	

	@Override
	public void run() {
		
		
		for(int i = n; i >= 0; i--) {
            System.out.println(i);
            
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} // for
		
	} // run()

	

	
	
	
	
}
