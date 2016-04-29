import java.util.Random;

public class Dice {

	private static String turn = null;
	
	private static Random random = new Random();
	
	private Dice(){}
	
	public synchronized static String getTurn(){
		
		return turn;
		
	}

	
	public static void setWhoStarts(String player) {
		
		turn = player;
		
	}
	
	public synchronized static void setTurn(String player) {
		
		turn = player;
		
	}

	public static int roll() {
		
		return random.nextInt(6)+1 ;
		
	}
	
	
	
	

}