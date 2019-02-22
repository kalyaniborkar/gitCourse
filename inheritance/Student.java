package inheritance;

public class Student {
       void study() {
    	   System.out.println("study like an engineer");
       }
       void exam() {
    	   System.out.println("give your best in exams");
       }

}
class FE extends Student{
	String event;
	void study() {
		System.out.println("study  and get good marks");
	}
	void volunteer(String event) {
		this.event=event;
	}
}
class SE extends Student{
	
	void study() {
		System.out.println("study from reference books");
		super.study();
	}	
}
class TE extends Student{
	String company;
   void study() {
		  
		System.out.println("study hard and enjoy the last year");
	}
	void placement(String co) {
          company = co;
	}
}
