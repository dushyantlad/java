public class UseCounter extends Thread{
	
	
	public void increment() {
		
		//
		synchronized(this) {
			
			Counter.count++;
			System.out.println("Thread="+ Thread.currentThread().getName()+" "+Counter.count);
		}
		
		
	}
	
	
	
	
	public void run() {
		
		increment();
		increment();
		increment();
		
		
	}
	
	
	
} 