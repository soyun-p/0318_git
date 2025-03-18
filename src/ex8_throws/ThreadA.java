package ex8_throws;

public class ThreadA {
	
	// 현재 코드에서 발생할 수 있는 예외를, 나를 생성하는 Main클래스로 던진다.
	
	public ThreadA() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		
		System.out.println("A스레드 생성");
	}

}
