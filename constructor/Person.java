package constructor;

public class Person {
           private String name;
           private int age;
           private boolean isMale;
           static int numPersons;    //total no of persons created and only one copy therefore static
           
  public Person() {
	  name="john";
	  age= 40;
	  isMale=true;
	  numPersons++;
  }
  
  //parameterize constructor
  public Person(String n, int a, boolean male) {
	  name=n;
	  age= a;
	  isMale=male;
	  numPersons++;
  }
  
  //method to display
   public void display() {
	  if(isMale) {
		  System.out.println("Mr. " + name);
	 }
	  else
		  System.out.println("Miss. " +name);
  }
   
   //if no argument it will increase age by 1
  void increaseAge() {
	  age=age+1;
  }
  
  //increase age by given number as argument
  void increaseAge(int incr) {
	  age=age+incr;
  }
  void print() {
	  System.out.println(name + " is " + age + " years old");
  }
}
