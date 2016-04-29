class Counter1 implements Runnable {

	public void incrementBallsAfterRuns() {
		
		synchronized(Runs.class){		
			
			synchronized(Balls.class) {
				
				Runs.runs++;
				
				Balls.balls++;
				
				
			}
					
		}
		
	}

	
	public void incrementRunsAfterBalls(){
		
		synchronized(Balls.class){		
			
			synchronized(Runs.class) {
				
				Balls.balls++;
				
				Runs.runs++;
				
				
			}	
			
		}
		
	}


	public void run() {
		
		incrementBallsAfterRuns();
		
		incrementRunsAfterBalls();
		
		
	}
		
	
	
}