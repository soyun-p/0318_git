package ex4_thread;

public class TreadMain {
	public static void main(String[] args) {
		
		System.out.println("메인스레드 시작");
		
		Ex_Thread th = new Ex_Thread();
		th.start();  // start() : 스레드에 run()메서드를 독립적으로 실행시키는 메서드
		// run메서드를 별개로 실행하려면 직접 호출하는 것이 아니라 start()메서드를 이용하여 호출한다.
		
		System.out.println("메인스레드 종료");
		
		// 메인 클래스와 스레드는 서로의 코드 순서와 별개로 각자의 작업을 수행한다. 따라서 메인스레드 시작, 종료를 출력후 실행중을 출력하게 된다.
		
	} // main

}
