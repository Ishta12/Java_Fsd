package newfeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo3 {

	public static void main(String[] args) {
		Order ord1=new Order(1000,"GOOG.NS",12000.10,Order.Side.BUY);
		Order ord2=new Order(500,"MS.TS",5000.50,Order.Side.SELL);
		Order ord3=new Order(750,"MS.TS",5000.50,Order.Side.BUY);

		List<Order> orderBook=new ArrayList<Order>();
		
		orderBook.add(ord1);
		orderBook.add(ord2);
		orderBook.add(ord3);

		//sort all orders based on price using Lambda
		System.out.println("Before Sorting :" + orderBook); //invokes toString() method
	
		Collections.sort(orderBook,(a,b)-> Order.compareByQuantity(a, b));
		System.out.println("After Sorting :" + orderBook); //invokes toString() method
	
		// sort all orders based on quantity using Method Reference
		Collections.sort(orderBook,Order::compareByQuantity);
		System.out.println("After sorting :"+orderBook);
		
		//sort all orders based on price using Method Reference BY calling instance Method
		Order order=orderBook.get(0);
		Collections.sort(orderBook,order::compareByPrice);
		System.out.println("Order Book after Sorting by Price: "+orderBook);
		
		//method Reference example for Arbitrary object of a particular type
		String[] symbols= {"GOOGLE", "amazon", "microsoft", "APPLE"};
		Arrays.sort(symbols,String::compareToIgnoreCase);
		
		for(String i:symbols)
		System.out.println(i);
		}
	}
