
public class YieldExample {
	 public static void main(String[] args)
	   {
	      Thread producer = new Producer("1");
	      Thread consumer = new Consumer();
	      //Thread producer2 = new Producer("2");
	 
	      producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
	      consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority
	      //producer2.setPriority(5);
	 
	      //producer.start();
	      //producer2.start();
	      //consumer.start();
	   }
}

class Producer extends Thread
{	
   private String name;	
   public static void print() {
	   System.out.println("Hello world.");
   }
   
   public Producer(String name) {
	   System.out.println("so good.");
	   this.name = name;
   }
   
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Producer "  + ": Produced Item " + i);
         Thread.yield();
      }
   }
   
   public String Name() {
	   return this.name;
   }
}
 
class Consumer extends Thread
{
   public void run()
   {
      for (int i = 0; i < 5; i++)
      {
         System.out.println("I am Consumer : Consumed Item " + i);
         Thread.yield();
      }
   }
}
