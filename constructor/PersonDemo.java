package constructor;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person p1=new Person("kalyani", 23, false);
          Person p2=new Person("rajesh", 28, true);
          Person p3=new Person("neha", 33, false);
          Person p4=new Person();
          
          
          p2.increaseAge(12);
          p3.increaseAge();
          p1.display();
          p2.print();
          p3.print();
          p4.print();
          
          
	}

}
