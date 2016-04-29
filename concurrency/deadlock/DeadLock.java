public class DeadLock {

	public static void main( String[] args) throws InterruptedException{
		
		Thread t1 = new Thread(new Counter1());
		
		Thread t2 = new Thread(new Counter1());
		
		t1.start();
		
		t2.start();
		
		System.out.println("Waiting for threads to complete execution...");
		
		
		t2.join();
		
		System.out.println("Done.");
		
		
		
	}
	


}