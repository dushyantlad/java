public class Time extends Thread{
	
	public void run(){
		
		try{
			
			for(int i =9; i>0 ;i--) {
			
				sleep(100);
				
				System.out.println(i);
				
			}
			
			
			
		} catch(InterruptedException ex) {
		
			System.out.println("Exception:"+ex.getMessage());
			
		}
		
		
	}
	
	
	public static void main(String[] args ) {
		
		Thread time = new Thread(new Time());
		time.start();
		
		try {
			
			//continue after time has completed execution
			time.join();
			
		} catch (InterruptedException ex) {
			
			System.out.println("Exception:"+ex.getMessage());
			
		} 
		
		
		System.out.println("Time!!");
		
		
	}
	
	
	
}