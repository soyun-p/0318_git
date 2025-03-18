package ex1_homework0317;

import java.util.Random;

public class HangManMain {
	public static void main(String[] args) {
		
		String[] word = { "apple", "game" };
		
		int rnd = new Random().nextInt(word.length);
		
		
		System.out.println("***HangMan***");
		
		HangMan hm = new HangMan( word[rnd] );  // 랜덤으로 뽑은 정답을 클래스로 보냄.
		hm.play();      // play 메서드 호출
		
		
		
		
	} // main

}
