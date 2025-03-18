package ex6_thread;

public class Thread1 extends Thread{
	
	int[] arr = new int[10];
	
	public void Thread() {
		
		for(int i= 0; i < arr.length; i++) {
			arr[i] = i;
		} // for
		
	} // Thread()
	
	
	
	@Override
	public void run() {
		
		for(int i = 0; i < arr.length; i++) {
			
			
			System.out.println(arr[i]);
			
		} // for
		
		
	} // run()

}
