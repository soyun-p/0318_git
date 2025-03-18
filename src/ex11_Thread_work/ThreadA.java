package ex11_Thread_work;

public class ThreadA extends Thread{
	
	
	private int[] arr;
	int sum = 0;
	
	public ThreadA( int[] arr ) {
		
		this.arr = arr;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("배열의 합 : " + sum);
		
	} // run()

}
