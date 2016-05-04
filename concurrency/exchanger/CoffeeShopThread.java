import java.util.concurrent.Exchanger;


public class CoffeeShopThread extends Thread {
	
	private Exchanger<String> sillyTalk;
	
	public CoffeeShopThread( Exchanger<String> args ) {
		
		sillyTalk = args;
		
	}
	
	public void run() {
		
		String reply = null;
		
		
		try {
			
			reply = sillyTalk.exchange("Who's there?");
			
			System.out.println("Duke: "+ reply);
			
			
			reply = sillyTalk.exchange("Duke who?");
			
			System.out.println("Duke: "+reply);
			
			
			reply = sillyTalk.exchange("");
			
			System.out.println("Duke: "+ reply);
			
			
		} catch ( InterruptedException ex ) {
			
			System.out.println("Exception : "+ ex.getMessage());
			
		} 
		
		
		
	}
	
	
	
	
}