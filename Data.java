import java.util.*;
//user defined exception
class NegativeAgeException extends ArithmeticException{
	public NegativeAgeException(){
		super("age cannot be negative");
	}
}
class display{
	void show(int age, String name){
		if(age<0){					//throws an exception if the age is negative
			throw new NegativeAgeException();
		}
		else{
			System.out.println("name "+name +"\nage "+age);		//displays the result in case of no exception
		}
	}
}
public class Data {
	public static void main(String args[]){
		Scanner g= new Scanner(System.in);
		display d= new display();
		System.out.println("enter your name");
		String name= g.next();
		System.out.println("enter your age");
		try{
			int age= g.nextInt();			//try and catch block for exception handling
			d.show(age, name);
		}
		catch(NegativeAgeException e){
			System.out.println(e);
		}
		
		
		
		
	}
	
}
