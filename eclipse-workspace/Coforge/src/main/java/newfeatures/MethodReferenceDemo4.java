package newfeatures;
//Java program to use Method Reference to a constructor
interface IMessage
{
	ConstructorReference getMessage(String msg);
}
class ConstructorReference
{
	ConstructorReference(String msg)
	{
		System.out.println(msg);
	}
}

public class MethodReferenceDemo4 {
	public static void main() {
		IMessage hello=ConstructorReference::new;
		hello.getMessage("Method refernce to Constructor");
	}
}
