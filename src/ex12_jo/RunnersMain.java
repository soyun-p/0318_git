package ex12_jo;

import java.util.Random;

public class RunnersMain {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int[] playerRandom = new int[4];
		String[] playerJump = new String[ playerRandom.length ];
		
		for(int i = 0; i < playerRandom.length; i++) {
			playerJump[i] = "";
		}
		
		boolean finish = false;
		int winPlayer = 0;
		
		while( true ) {
			
			for(int i = 0; i < playerRandom.length; i++) {
				playerRandom[i] = rnd.nextInt(3);
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			for(int i = 0; i < playerRandom.length; i++) {
				
				switch( playerRandom[i] ) {
				case 0:
					playerJump[i] += "";
					break;
					
				case 1:
					playerJump[i] += " ";
					break;
					
				case 2:
					playerJump[i] += "  ";
					break;
				} // switch
				
			} // for
			
			
			System.out.println("------------------------------------------------------------------");
			
			for(int i = 0; i < playerJump.length; i++) {
				System.out.println(playerJump[i]);
				System.out.println(i + 1 + "옷");
			}
			
			// if( playerJump[i] ) {
				
			// }
			
			System.out.println("-------------------------------------------------------------------");
			
			
			if( finish ) {
				System.out.println("winner - "  );
			}
			
			
		} // while
		
		
	} // main

}
