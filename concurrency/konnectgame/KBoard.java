public class KBoard{
	
	private KBoard(){}
	
	private static final int ROWS=4;
	
	private static final int COLS=4;
	
	private static String[][] kboard = new String[ROWS][COLS]; 
	
	private static String turn = null;
	
	public synchronized static String getTurn(){
		
		return turn;
		
	}
	
	public synchronized static void setTurn(String player) {
		
		turn = player;
		
	}
	
	public static void setWhoStarts(String player){
		
		turn = player;
		
	}
	
	public synchronized static void setCell(int row, int column){
		
		kboard[(ROWS-1)-row][column] = turn.equals(Gamers.JOE)? "X" : "Y";
		
	}
	
	public synchronized static String getCell(int row, int column){
		
		return kboard[(ROWS-1)-row][column];
		
	}
	
	
	public synchronized static void printKboard(){
		
		for(int i=0; i<ROWS ; i++) {
			
			for(int j=0; j<COLS; j++) {
				
				if(kboard[i][j] != null)
				
					System.out.print(kboard[i][j]+" ");
					
				else
					
					System.out.print("-" + " ");
				
				
			}
			
			System.out.println();
		}
		
		
	}
	
	
	
}