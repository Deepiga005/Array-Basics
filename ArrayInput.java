package JavaProgm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		arr1=new int[n];
		System.out.println("enter array element");
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
           System.out.println("array elements are");
           System.out.println(Arrays.toString(arr1));
           
           
	}

}
