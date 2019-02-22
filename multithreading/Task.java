package multithreading;

public class Task implements Runnable  {
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		 task1();
		 task2();
		 task3();
		 
	}

	private void task1() {
		// TODO Auto-generated method stub
		System.out.println("this is task 1");
	}

	private void task2() {
		// TODO Auto-generated method stub
		System.out.println("this is task 2");
	}

	private void task3() {
		// TODO Auto-generated method stub
		System.out.println("this is task 3");
	}
	
}
class Demo{
	public static void main(String[] args) {
		Task t= new Task();
		Thread t1= new Thread(t);
		t1.run();
	}
}


