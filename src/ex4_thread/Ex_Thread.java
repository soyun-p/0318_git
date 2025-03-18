package ex4_thread;

public class Ex_Thread extends Thread{ // 쓰레드를 상속 받았다면 반드시 run 메서드를 오버라이딩해줘야 한다.
	
	// 스레드 : 독립적인 실행단위
	// 한 번에 두 가지 이상의 프로세스를 실행 가능하게 한다. (=> 멀티 태스킹)
	// start() : 스레드에 run()메서드를 독립적으로 실행시키는 메서드
	
	@Override
	public void run() {
		// 백그라운드에서 별개로 수행할 코드들은 반드시 run 메서드 안에서 실행.
		// 독립적인 수행을 위한 영역 run
		for(int i = 0; i < 10; i++){
			System.out.println("run() 실행중");
		} // for
		
	} // run() 메서드
	

}
