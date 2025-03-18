package ex11_Thread_work;

public class ThreadMain {
	public static void main(String[] args) {
		
		// 배열 arr의 담긴 합을 A스레드가 계산
		// 곱은 B스레드가 계산
		
		// 배열의 합 : 29
		// 배열의 곱 : 3960   (결과는 스레드 컨디션에 따라 순서가 바뀔수도 있다.)
		
		int[] arr = { 3, 5, 11, 6, 4 };
		
		
		ThreadA ta = new ThreadA(arr);
		ThreadB tb = new ThreadB(arr);
		
		ta.start();
		tb.start();
		
		
		
		
		
		
		
	} // main

}
