package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		// try-catch(예외 처리)
		// : 자바에서 jvm이 실행되는 도중 예외(에러)가 발생하면 그 시점에서 프로그램이 강제적으로 종료.
		// 이것은 매우 올바른 판단이지만, 때로는 예상할 수 있는 오류에 대해 프로그램 종료 없이 작업을 이어나가야 할 때가 있다.
		// 따라서 예외 처리를 통해 프로그램의 비정상적인 종료를 줄일 수 있다.
		
		int result = 0;
		int [] arr = { 1, 2, 3 };
		
		
		try { // 이 안에서 일어난 오류는 catch를 들렀다가 밖으로 빠져나간다. 오직 try 영역 내의 오류 코드만 가능.
			// 만약 try 영역 내에서 오류가 발생하지 않는다면 catch구문은 아예 작동하지 않는다.
			// try 영역에 오류를 여러 개 넣어도 한 번에 하나씩만 처리 가능. 따라서 처음 만난 오류 하나만 처리.
			// 여러 개의 오류를 처리하고 싶다면 오류의 갯수만큼 catch를 만들면 된다.
			
			result = 10 / 2;  // ArithmeticException
			arr[2] = 4;       //ArrayIndexOutOfBoundsException 
			
		}catch( ArithmeticException e ) { // 자바의 모든 Exception(오류)를 모아놓은 코드?
			// e.printStackTrace();  // 오류가 무슨 오류인지 보여준다.
			System.out.println("정수는 0으로 나눌 수 없어요");
			
		}catch( ArrayIndexOutOfBoundsException e ) {
			System.out.println("배열의 없는 index로 접근하지 마세요");
		}finally { 
			
			// finally는 예외 유무에 관계없이 무조건 한 번 실행되는 영역.
			System.out.println("finally");
		}
		
		
		System.out.println(result);
		
		
		
	} // main
	
	
	// 오류가 난 줄 아래로는 오류가 나오지 않는다. jvm이 오류를 만나면 그 다음 줄을 실행하지 않고 바로 튕기기 때문이다.
	// 따라서 오류가 발생한 줄부터 위로 올라가면서 또다른 오류를 찾아야 한다.

}
