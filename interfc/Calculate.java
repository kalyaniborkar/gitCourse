package interfc;

public class Calculate implements Area {

	@Override
	public void Circle(float r) {
		// TODO Auto-generated method stub
		
		 double area;
		 area= 3.14*r*r;
		 System.out.println("Area of circle is: " + area);
	} 

	@Override
	public void Triangle(float s) {
		// TODO Auto-generated method stub
		double area= 0.433 *s*s;
		System.out.println("Area of triangle is: " + area);
	}

}
