
public class Hex {
	
	public static void main(String[] args) {
		
	}
	
	/**
	 * Approach: Start from the bottom and work our way to the top.
	 * 			 Will seperate the function into 3 for loops.
	 * 			 1st loop will write the bottom third (increasing length)
	 * 			 2nd loop will write the middle third (maintaining length)
	 * 			 3rd loop will write the top third (decreasing length)
	 * 
	 * For the marks, they will be added at the end, after the hexes are made
	 * 
	 * @param length = number of diagonal hexes/number of vertical hexes
	 * @return string[] which represents the game
	 */
	public String[] getHex(int length, String[] marks) {
		String[] hexGame = new String[length*3];
		
		for (int i = hexGame.length; i > hexGame.length * (2/3); i--) {
		
		}
		
		for (int i = hexGame.length * (2/3); i > hexGame.length * (1/3); i--) {
			
		}
		
		for (int i = hexGame.length * (1/3); i >= 0; i--) {
			
		}
		
		
		// add in the marks here
		
		return hexGame;
		
		
	}
	
	
	

}
