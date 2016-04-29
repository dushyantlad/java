public class BasicThreadStates extends Thread{
	
	
	public static void main( String[] args) {
		
		Thread thread = new Thread();
		System.out.println("Thread State="+ thread.getState());
		
		thread.start();		
		System.out.println("Thread State="+ thread.getState());
		
		try {
			
			thread.join();	
			System.out.println("Thread State="+ thread.getState());
				
		} catch ( Exception ex) {
			
			System.out.println("Exception:"+ ex.getMessage());
			
		}
		
		
		//print all the states
		for(Thread.State state: Thread.State.values())
			System.out.println("ALL STATES="+ state );
		
		
		
		
		
	}
	
	
	
	
	
}