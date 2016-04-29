import java.util.Scanner;

public class KPlayer extends Thread {

	private String currentPlayer = null;
	
	private String otherPlayer = null;
	
	private static final int TURNS=1;
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int row=0;
	
	private static int col=0;
	
	public KPlayer(String thisPlayer) {
		
		currentPlayer = thisPlayer;
		
		otherPlayer = currentPlayer.equals(Gamers.JOE)? Gamers.JANE:Gamers.JOE;
			
	}
	
	
	public void run() {
		
		for(int i=0; i<TURNS ; i++) {
			
			synchronized(KBoard.class) {
				
					
				while(!KBoard.getTurn().equals(currentPlayer)) {
					
					try {
						
						KBoard.class.wait(1000);
						
						System.out.println(currentPlayer + " was waiting for " + otherPlayer);
						
						
					} catch (InterruptedException ex) {
						
						System.out.println("Exception:"+ex.getMessage());					
						
					}
					
				}	
				
				System.out.println("Enter cell co-ordinates "+currentPlayer);
				
				boolean validInput = false;
				
				while(!validInput) {
				
					System.out.print(currentPlayer +" ROW=");
					row = scanner.nextInt();
					
					System.out.print(currentPlayer +" COL=");
					col = scanner.nextInt();
					
					//simple validate
					if( 0 <= row && row < 4 && 0 <= col && col < 4 && KBoard.getCell(row,col)== null) {
						
						validInput = true;
						
						break;

					}
											
						
					System.out.println("Invalid input. Enter Again.");
				}
				
				
				
				KBoard.setCell(row,col);
				
				KBoard.printKboard();
				
				KBoard.setTurn(otherPlayer);
				
				KBoard.class.notifyAll();
					
				
			}
					
			
		}
		
		
		
	}
	
	
	


}