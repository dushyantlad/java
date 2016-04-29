import java.util.concurrent.*;

class Runner extends Thread{

	private CountDownLatch timer;

	
	//constructor
	public Runner(CountDownLatch cdl, String name) {
		
		this.timer = cdl;
		
		this.setName(name);
		
		System.out.println( this.getName() + " ready and waiting for the count down to start");
		
		start();
		
	}
	
	
	public void run() {
		
		
		try {
			
			//wait for timer count down to reach 0
			timer.await();			
			
		} catch (InterruptedException ex) {
			
			System.out.println("Exception:"+ ex.getMessage());
			
		} 
		
		System.out.println( this.getName() + " started running");
		
	}
	
	
	
	
}