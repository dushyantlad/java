//This is sample

class MyThread extends Thread {

  public void run(){
    
    try {
      
      sleep(1000);
      
      System.out.println("Thread="+ this.getName());
    
    } catch(InterruptedException ie) {
      
      System.out.println("Exception:"+ie.getMessage());
      
    }
    
  }  
  
  
  
  public static void main(String[] args) {
    
      MyThread myThread = new MyThread();
      myThread.start();
    
      System.out.println("Main Thread="+ Thread.currentThread().getName());
    
  }
}
