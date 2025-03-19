package ex13_homework;

public class TimeThread extends Thread{
	
	// 몇 초가 경과했는지 세는 변수
	private int timer = 0;
	
	public int getTimer() {
		return timer;
	}  // 타이머의 값을 받아서 main에서 출력해야 하기 때문에 게터를 만들어줘야 한다.
	

	// 게임 중을 나타내는 변수
	private boolean isPlaying = true;
	
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}  // 나중에 false 값을 받아야 하기 때문에 세터를 만들어줘야 한다.
	
	


	@Override
	public void run() {
		
		while( isPlaying ) {  // isPlayint == true
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			timer++;
			
		} // while
		
	} // run() 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*
	int timeCount = 0; // 얼마나 지났는지 세는 변수
	int answerCount = 0;  // 정답을 맞춘 문제를 세는 변수

	Random ran = new Random();

	Scanner sc = new Scanner(System.in);
	int input;

	@Override
	public void run() {

		while( answerCount < 5 ) {

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
	*/





}
