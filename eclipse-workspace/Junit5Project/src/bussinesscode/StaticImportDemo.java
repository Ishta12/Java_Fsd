package bussinesscode;
import static java.lang.Math.*;
import static java.lang.System.*;

/* In Java, static import concept is introduced in 1.5 version. With the help of static import, we can access the static members of a class directly without class name or any object. */

public class StaticImportDemo {

	public static void main(String[] args) {
		
		//Without static import
		/* System.out.println(Math.abs(10.22))
		 * System.out.println(Math.sqrt(13))
		 * System.out.println(Math.pow(10,2))
		 */
		
		//With using static import of Math and System
		out.println(abs(10.22));
		out.println(sqrt(13));
		out.println(pow(10,2));

	}

}
