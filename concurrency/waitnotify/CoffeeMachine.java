class CoffeeMachine extends Thread {
	
	static String coffeeMade = null;
	static final Object lock = new Object();
	private static int coffeeNumber =1;
	
	void makeCoffee() {
		
		synchronized(CoffeeMachine.lock) {
			
			if(coffeeMade != null) {
				
				try {
					
					System.out.println("Coffee machine: Waiting for waiter notication to deliver the coffee");
					
					CoffeeMachine.lock.wait();
					
					
					
				} catch(InterruptedException ex) {
					
					System.out.println("Exception:"+ex.getMessage());
					
				}
				
			}
			
			coffeeMade = "Coffee No. " + coffeeNumber++;
			
			System.out.println("Coffee machine says: Made "+ coffeeMade);
			
			CoffeeMachine.lock.notifyAll();
			
			System.out.println("Coffee machine: Nofifying waiter to pick the coffee");
				
			
		}
		
	}
	
	
	public void run() {
		
		while (true) {
			
			
			makeCoffee();
			
			try {
				
				System.out.println("Coffee machine: Making another coffee now");
				
				Thread.sleep(1000);
				
				
			} catch (InterruptedException ex) {
				
				System.out.println("Exception:"+ex.getMessage());
				
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
	
}