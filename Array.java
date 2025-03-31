
package JavaProgm;

public class Array {

	public static void main(String[] args) {
		int a=10;
		int[]arr;
		
		arr=new int[5];//correct way of memory allocation
		arr[0]=12;
		arr[1]=29;
		arr[2]=25;
		arr[3]=23;
		arr[4]=20;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("element at index"+" "+i+" "+"is"+" "+arr[i]);
		}

	}

}
