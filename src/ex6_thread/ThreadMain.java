package ex6_thread;

public class ThreadMain {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		try {
			// 강제 5초간 휴식
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("메인스레드 종료");
		
		
	} // main

}
