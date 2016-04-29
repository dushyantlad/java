import java.util.concurrent.Semaphore;


public class ATMRoom {

	public static void main(String[] args) {
		
		//2 people can access ATM at same time
		Semaphore machines = new Semaphore(2);
		
		
		new Person(machines, "A");
		
		new Person(machines, "B");
		
		new Person(machines, "C");
		
		new Person(machines, "D");
		
		new Person(machines, "E");
		
		
	}


}