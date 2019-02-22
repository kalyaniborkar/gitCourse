package multithreading;

public class MyThread  extends Thread{
   String myname;
   MyThread(){
	   myname="kalyani";
   }
   public void run() {
	   System.out.println("hello  My name is " + myname);
   }
	
	
}
class ThreadDemo{
public static void main(String[] args) {
    Thread t=new MyThread();
    t.run();
}
}
