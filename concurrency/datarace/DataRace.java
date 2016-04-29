public class DataRace {
	
	
	public static void main ( String[] args) {
		
		
		UseCounter c = new UseCounter();
		
		Thread thread1 = new Thread( c );
		Thread thread2 = new Thread( c );
		Thread thread3 = new Thread( c );
		
		thread1.start();
		thread2.start();
		thread3.start();
			
		
		
		
	} 
	
	
	
	
}