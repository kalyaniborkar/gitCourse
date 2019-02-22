package inheritance;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //   Student s = new Student();    
       //    s.study();                    //this will execute parent class methods
		
		
		//to invoke children class methods
         Student [] s= new Student[3];
         s[0]= new FE();
         s[1]= new SE();
         s[2]= new TE();
         System.out.print("FE : "); s[0].study(); 
         System.out.print("SE : ");s[1].study(); 
         System.out.print("TE : ");
         s[2].study(); 
	}

}
