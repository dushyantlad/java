public class KGame{

	public static void main(String[] args){
		
		KPlayer player1 = new KPlayer(Gamers.JANE);
		
		KPlayer player2 = new KPlayer(Gamers.JOE);
		
		
		KBoard.setWhoStarts(Gamers.JOE);
		
		player1.start();
		
		player2.start();
		
		
		
	}

}