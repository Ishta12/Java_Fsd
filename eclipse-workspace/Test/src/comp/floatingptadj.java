package comp;
import java.util.*;
public class floatingptadj {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Initial floating number: ");
			float fn = sc.nextFloat();		
			float next_down_fn = Math.nextDown(fn);
			float next_up_fn = Math.nextUp(fn);
			System.out.println("Float " + fn + " next down is " + next_down_fn);
			System.out.println("Float " + fn + " next up is " + next_up_fn);
			System.out.println("Enter Initial double number: " );
			double dn = sc.nextDouble();
			double next_down_dn = Math.nextDown(dn);
			double next_up_dn = Math.nextUp(dn);
			System.out.println("Double " + dn + " next down is " + next_down_dn);
			System.out.println("Double " + dn + " next up is " + next_up_dn);
		    }

	}
