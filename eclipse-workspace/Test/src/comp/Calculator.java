package comp;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		Calculate(a,b,ch);
	}
	public static void Calculate(int a,int b, int ch)
	{
		switch(ch)
		{
		case 1: 
			int c;
			c= add(a,b);
			System.out.println(c);
			break;
		case 2: 
			int d;
			d= sub(a,b);
			System.out.println(d);
			break;
		case 3: 
			int e;
			e= mul(a,b);
			System.out.println(e);
			break;
		case 4: 
			double f;
			f= div(a,b);
			System.out.println(f);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public static int sub(int a, int b)
	{
		int c=a-b;
		return c;
	}
	public static int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}
	public static double div(int a, int b)
	{
		int c=a/b;
		return c;
	}
}
