package ex5_multi_thread;

public class TMain {
	public static void main(String[] args) {
		
		Thread01 t1 = new Thread01();
		Thread02 t2 = new Thread02();
		
		t1.start();
		t2.start();
		
		
		System.out.print("3");
		
		// 실행할 때마다 3뒤에 1, 2 중 누가 먼저 올지는 항상 다르다. 
		// 먼저 준비된 스레드가 실행된다. 그러나 그렇다고 해서 먼저 시작한 스레드가 끝나고서 다른 스레드가 시작되지는 않는다.
		// 시작만 먼저 할 뿐 스레드들끼리 번갈아가면서 실행된다.
		// 그러나 너무 빠르게 번갈아서 작업을 하다보니 따로따로 실행하는 것 같이 보인다.
		
		
	} // main

}
