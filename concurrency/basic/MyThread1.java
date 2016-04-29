
public class MyThread1 implements Runnable{

	public void run() {
		
		//MyThread1 does not extend Thread and hence sleep and getName are not available.
		
		//try {
			
			//sleep(1000);
			System.out.println("Thread="+ Thread.currentThread().getName());
			System.out.println("Thread="+ Thread.currentThread());
			
			
		//} catch (InturrptedException ie) {
			
		//	System.out.println("Exception:"+e.getMessage);
			
		//}
				
	}
	
			
		
	public static void main(String[] args) {
		
		Thread myThread = new Thread(new MyThread1());
		myThread.start();
		
		System.out.println("Main Thread="+Thread.currentThread().getName());
		System.out.println("Main Thread="+ Thread.currentThread());

		
	}
		


}