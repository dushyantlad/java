public class Waiter extends Thread {
	
	
	public void getCoffee() {
		
		synchronized(CoffeeMachine.lock) {
			
			if(CoffeeMachine.coffeeMade == null) {
				
				try {
					
					System.out.println("Waiter: Will get orders till coffee machine notifies me");
					
					CoffeeMachine.lock.wait();
					
					
					
				} catch (InterruptedException ex) {
					
					System.out.println("Exception ex:"+ ex.getMessage());
					
					
				}
				
			}	
				
			System.out.println("Waiter: Delivering "+ CoffeeMachine.coffeeMade);
			
			CoffeeMachine.coffeeMade = null;
				
			CoffeeMachine.lock.notifyAll();
				
			System.out.println("Waiter: Notify coffee machine to make another one");
					
			
		}
		
		
		
		
		
	}
	
	
	
	
	public void run() {
		
		while(true) {
			
			getCoffee();
			
		}
		
		
	}
	
	
	
}