package JavaProgm;
import java.util.Scanner;
import java.util.Arrays;
public class Newone {
// square of elements
	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);

		        // Ask for the size of the array
		        System.out.println("Enter the size of the array:");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		       int square[]=new int[n];
		       System.out.println("enter elements:");
		       for(int i=0;i<n;i++) {
		    	   arr[i]=sc.nextInt();
		    	   square[i]=arr[i]*arr[i];
		    	   }
		       System.out.println("elements of array:"+Arrays.toString(arr));
		       System.out.println("the square values:"+Arrays.toString(square));
		        sc.close();
		      
		}
}


