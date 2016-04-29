import java.util.concurrent.Semaphore;

class Person extends Thread {

	private Semaphore machines;
	
	public Person(Semaphore machines, String name) {
		
		this.machines = machines;
		
		this.setName(name);
		
		this.start();
		
	}
	
	public void run() {
		
		
		try {
			
			System.out.println(this.getName() +" waiting to access an ATM machine");
			
			machines.acquire();
			
			System.out.println(this.getName() +" is accessing an ATM machine");
			
			machines.release();
			
			System.out.println(this.getName() +" is done using the ATM machine");
					
			
		} catch (InterruptedException ex) {
			
			System.out.println("Exception:"+ex.getMessage());
			
		}
		
		
	}
	
	
}