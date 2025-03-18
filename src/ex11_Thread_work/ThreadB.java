package ex11_Thread_work;

public class ThreadB extends Thread {
	
	private int[] arr;
	int res = 1;
	
	public ThreadB( int[] arr ) {
		
		this.arr = arr;
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0; i < arr.length; i++) {
			res *= arr[i];
		}
		
		System.out.println("배열의 곱 : " + res);
		
	} // run()

}
