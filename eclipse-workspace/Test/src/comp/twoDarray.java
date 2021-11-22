package comp;
import java.util.*;
public class twoDarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("Enter the elements of the first 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of the second 2D array");
		int b[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[3][3];
		System.out.println("Here is the addition matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j]; 
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(c[i][j]);
			}
		}
	}

}
