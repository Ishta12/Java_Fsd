package comp;
import java.util.*;
public class sumofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rem,sum=0;
		while(num!=0 && num<=1000)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
	System.out.println(sum);
	}
	

}
