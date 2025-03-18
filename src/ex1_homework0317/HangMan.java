package ex1_homework0317;

import java.util.Scanner;

public class HangMan {
	
	Scanner sc;
	char[] star;
	int playCount;
	
	boolean check;   // 정답에 입력받은 단어가 포함되어 있는지 확인하는 변수
	boolean isPlaying;  // 게임이 끝났음을 판단하는 변수
	
	
	// 정답 변수
	String word;
	
	public HangMan( String word ) { 
		
		this.word = word;
		star = new char[word.length()];  //정답의 길이만큼 배열 생성
		sc = new Scanner(System.in);
		
	} // HangMan 생성자
	
	
	public void play() {
		
		// star 배열을 별로 채운다.
		for(int i = 0; i < star.length; i++) {
			star[i] = '*';   
		}
		
		
		label:while( true ) {
			playCount++;   // 몇 번 실행했는지 세는 변수
			
			System.out.print("word : ");
			for(int i = 0; i < star.length; i++) {
				System.out.print(star[i]);
			} // for  :  
			System.out.print(">> ");
			
			// 사용자에게 입력받는 변수
			String in = sc.next(); // 입력받는 변수를 문자열로 저장.
			char c = in.charAt(0); // 입력 받은 문자열을 char 형으로 변환.
			
			// 한 글자의 소문자만 입력했는지 판단.
			if( c < 'a' || c > 'z' || in.length() > 1 ) {
				System.out.println("한 글자의 영 소문자만 입력하세요.");
				continue;
			}
			
			check = false;
			isPlaying = false;
			
			
			for(int i = 0; i < word.length(); i++) {
				
				if( star[i] == c ) {
					System.out.println(c + "은(는) 이미 입력함");
					continue label;
				}
				
				// 사용자의 입력값이 정답에 일치하는 값인지 확인
				if( c == word.charAt(i) ) {// 정답에 입력받은 문자와 같은 문자가 있다면
					star[i] = c;     // 해당 자리에 있는 별을 문자로 바꾼다.
					check = true;
					
				} // if
				
				// 게임을 계속할 것이지를 판단
				if( star[i] == '*' ) {
					isPlaying = true; // 아직 게임중
				} // if
				
			} // for
			
			if( !check ) {
				System.out.println(c + "이(가) 포함되어 있지 않음");
			}
			
			
			// 게임 종료 판단
			if( !isPlaying ) {  // isPlaying == false
				System.out.println(word + "정답!");
				System.out.println(playCount + "회 만에 정답!");
				break;
			}
			
			
			
		} // while
		
		
		
		
	} // play() 메서드
	
	
	
	

}
