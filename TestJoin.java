
public class TestJoin {

	public static void main(String[] args) {
		   
	    MyThread2 t1 = new MyThread2("TestJoin11");
	    MyThread2 t2 = new MyThread2("TestJoin22");

	    t1.start();
	    t2.start();
	    try {
	      t1.join();  //join()合并线程，子线程运行完之后，主线程才开始执行
	     }catch (InterruptedException e) {  }
	      
	     for(int i=0 ; i < 5; i++)
	              System.out.println("I am Main Thread");
	   }
	 }
	 
	 class MyThread2 extends Thread {
	  
	    MyThread2(String s) {
	     super(s);
	     }
	     
	  public void run() {
	    for(int i = 1; i <= 5; i++) {
	     System.out.println("I am "+getName());
	     try {
	      sleep(1000); //暂停，每一秒输出一次
	      }catch (InterruptedException e) {
	      return;
	     }
	     }
	   }

}
