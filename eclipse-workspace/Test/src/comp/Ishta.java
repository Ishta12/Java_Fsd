package comp;

import java.util.*;

public class Ishta {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner obj=new Scanner(System.in);
		for (int i=0;i<10;i++)
		{
			int a=obj.nextInt();
			arr[i]=a;
		}
		for(int j=9;j>=0;j--)
		{
			System.out.println(arr[j]);
		}

	}

}
