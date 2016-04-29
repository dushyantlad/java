import java.util.concurrent.*;

class RunningRaceStarter {

	public static void main(String[] args) throws InterruptedException {
		
		CountDownLatch counter = new CountDownLatch(5);
		
		new Runner(counter, "carl");
		
		new Runner(counter, "Joe");
		
		new Runner(counter, "Jack");
		
		
		System.out.println("Starting the countdown");
			
		long countVal = counter.getCount();
		
		
		while (countVal > 0) {
			
			Thread.sleep(1000);
			
			System.out.println( countVal );
			
			if( countVal == 1) {
				
				System.out.println("Start");
				
			}
		
			//decrements counter
			counter.countDown();
			
			countVal = counter.getCount();
			
		} 
			
		
		
		
		
		
	}




}