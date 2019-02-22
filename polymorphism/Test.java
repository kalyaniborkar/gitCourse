package polymorphism;

public class Test {
	
	void method(int a,int b) {
		System.out.println("the values of a and b are: " + a +" " +  b);
	}
	void method(int a,float b) {
		System.out.println("the values of a and b are: " +a+", " +b);
	}

	void method(int a, float b, double c) {
		System.out.println("the values of a , b and c are: " +a+", " +b+", " +c);
	}

	void method(double a,float b) {
		System.out.println("the values of a and b are: " +a+", " +b);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
        t.method(2, 3);
		t.method(3, 0.2f, 5.99999999d);
		t.method(7.8d, 2.1f);
		t.method(7, 9.22f);
		
		

	}

}
