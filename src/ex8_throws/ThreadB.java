package ex8_throws;

public class ThreadB {
	
	public ThreadB() throws InterruptedException {
		
		Thread.sleep(3000);
		
		System.out.println("B스레드 생성");
		
	}

}
