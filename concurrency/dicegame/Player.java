public class Player extends Thread{
	
	private String currentPlayer = null;
	
	private String otherPlayer = null;
	
	public Player(String thisPlayer){
		
		currentPlayer = thisPlayer;
		
		otherPlayer = thisPlayer.equals(Gamers.JOE)?Gamers.JANE:Gamers.JOE;
		
	}
	
	public void run () {
		
		for(int i=0; i<6; i++) {
		
			synchronized (Dice.class) {
				
				while (!Dice.getTurn().equals(currentPlayer)) {
				
					try {
						
						Dice.class.wait(1000);
						
						System.out.println(currentPlayer + "was waiting for "+ otherPlayer);
						
						
					} catch (InterruptedException ex) {					
						
						System.out.println("Exception:"+ ex.getMessage());
						
					}
				
				}
				
				
				System.out.println(Dice.getTurn() + " throws " + Dice.roll());
				
				Dice.setTurn(otherPlayer);
				
				Dice.class.notifyAll();
							
			}
		
		
		}
		
		
	}
	
	
}