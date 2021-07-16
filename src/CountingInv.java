import java.io.*;
import java.util.Scanner;

public class CountingInv {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		

		int[] array = new int[100000];
		 Scanner sc = new Scanner(new File("/Users/dhananjayseetha/Downloads/integerArray.txt"));
		 	for(int i=0;i<100000;i+=1) {
		 		array[i] = sc.nextInt();
		 	
		 	} 
		 	System.out.println("game on bebe/n");
		 //	for(int j=0;j<100000;j++) {
		 //		System.out.println(array[j]);
		 //	}
		 //	System.out.println("this is first element -> " + array[0]);
		 //	System.out.println("this is last element -> " + array[99999]);
		 	
		 	long example = mergesort(array, 0, array.length - 1);
		 	System.out.println(example);
		 	//for(int i=0; i < array.length; i++) {
			 //	System.out.println(array[i]);
			 //	}
		 	
	}
	public static int merge(int[] array,int low,int mid,int high) {
			int count=0;
			int[] merged = new int[array.length];
			int i=low;
			int j=mid+1;
			int k=low;
			while(i <= mid && j <= high) {
			if(array[i] < array[j]) {
				merged[k] = array[i];
				i++;
				k++;
			}
			else{
				merged[k] = array[j];
				count += (mid+1-i);
				j++;
				k++;
				
			}
			}
			
			if(j > high) {
				while(i <= mid) {
					merged[k] = array[i];
					i++;
					k++;
				}
			}
			if(i > mid) {
				while(j <= high) {
					merged[k] = array[j];
					j++;
					k++;
				}
			}
			for(int z=low; z<=high; z++) {
				array[z] = merged[z];
			}
			return count;
}
		private static long mergesort(int[] array, int low, int high) {
			// TODO Auto-generated method stub
			if(low < high) {
				 int mid = (low + high) / 2;
				 long x = mergesort(array,low, mid);
				 long y = mergesort(array, mid + 1, high);
			     int z = merge(array,low,mid,high);
				return x+y+z;
			}
			return 0;
		}
		}

