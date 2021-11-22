package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Creating consumer action
public class ForEachDemo1 {
	
	public static void main(String[] Args) {
		
		List<String> names=Arrays.asList("John","Mike","Alex");
		
		//below is the consumer action
		Consumer<String> convertUpperCase=new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t.toUpperCase());
						// TODO Auto-generated method stub
						
					}
			
				};
				
				//traversing through Consumer Interface Implementation
				names.forEach(convertUpperCase);
				
				//Consumer to display a number
				Consumer<Integer> display= a -> System.out.println(a);
				display.accept(null);
	}
}
