package newfeatures;
//Method reference - Shorthand of lambda expression to call method

@FunctionalInterface
interface MyInterface
{
	void myMethod();
}
class Test //instance class
{
	void display() //instance method
	{
		System.out.println(" I am a Instance  method");
	}
}
public class MethodReferenceDemo1 {

	public static void main(String[] args) {
		//traditional approach
		Test t1=new Test();
		t1.display();
		
		//java8 method reference approach
		MyInterface m1ref=t1::display; // method reference to instance method of Object
		
		//calling method of FI
		m1ref.myMethod();
	}
}
