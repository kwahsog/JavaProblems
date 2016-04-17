package misc;

/*Solution to the problem: given a knight chess piece on a phone keypad, how many different possible
 * combinations of phone numbers can be made by moving the piece (valid moves defined by the knight).
 * Keypad: 
 * 789
 * 456
 * 123
 * +0*
 * Valid phone number only contains 0123456789 and not *+.
 * Exercise in dynamic programming.
 */

public class KnightsKeypad {	
	
	public static int KnightsKeypadSol(int lengthofphoneno, int startpos) {
		
		//only one number possible
		if(startpos == 5) return 1;
		
		//create 2D array of results depending on length of phoneno.
		int[][] Results = new int[lengthofphoneno][10];
		//create list of valid moves
		int[][] ValidMoves = {{4,6},{6,8},{7,9},{4,8},{3,9,0},{},{1,7,0},{2,6},{1,3},{2,4}};

		//populate starting values with 1
		for(int p = 0; p<10; p++){
			Results[0][p] = 1;
		}
		
		//dynamic programming: populate next entry with sum of previous entries depending on valid moves.
		for(int digits = 1; digits < lengthofphoneno; digits++){
			for (int f = 0; f < 10; f++){
				for(int i = 0; i < ValidMoves[f].length; i++){					
					Results[digits][f] += Results[digits-1][ValidMoves[f][i]];
				}						
			}
		}
		return Results[lengthofphoneno-1][startpos];
	}
	
	public static void main(String args[]){
		
		//expected 1424
		System.out.println("Length 10, start 1: "+KnightsKeypadSol(10,1));
		System.out.println("Length 10, start 2: "+KnightsKeypadSol(10,2));
	}

}
