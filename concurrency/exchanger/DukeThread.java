import java.util.concurrent.Exchanger;

public class DukeThread extends Thread {
	
	private Exchanger<String> sillyTalk; 
	
	public DukeThread( Exchanger<String> args ) {
		
		sillyTalk = args;
		
	}
	
	public void run() {
		
		String reply = null;

		try {
			
			
			reply= sillyTalk.exchange("Knock Knock !");
			
			System.out.println("CoffeeShop: "+ reply);
			
			
			reply = sillyTalk.exchange("Duke");
			
			System.out.println("CoffeeShop: "+ reply);
			
			
			reply= sillyTalk.exchange("The one who was born in this coffee shop!");
			
			
		} catch (InterruptedException ex) {
			
			System.out.println("Exception : "+ ex.getMessage());
			
		}
		
		
	}
	
	

}