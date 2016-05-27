import java.util.concurrent.*;

class MixedDoubleTennisGame extends Thread {
	
	public void run() {
		
		System.out.println("All four players ready, game start ...");
		
	}
	
}



class Player extends Thread {
	
	CyclicBarrier waitPoint;
	
	public Player (CyclicBarrier barrier, String name) {
		
		this.setName(name);
		
		waitPoint = barrier;
		
		this.start();
		
	}
	
	public void run(){
		
		System.out.println("Player " + getName() + " is ready ");
		
		try {
				
			waitPoint.await();
			
		} catch (BrokenBarrierException | InterruptedException ex) {
			
			System.out.println("An exception occurred while waiting ...:"+ex.getMessage());
			
		}
		
	}
		
	
}


class CyclicBarrierTest {
	
	public static void main (String[] args) {
		
		System.out.println("Reserving tennis court \nAs soon as four players arrive game will start");
		
		CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
	
		new Player(barrier, "A");
		
		new Player(barrier, "B");
		
		new Player(barrier, "C");
		
		new Player(barrier, "D");
		
	}
	
}