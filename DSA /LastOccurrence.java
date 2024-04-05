
import java.util.*;
import java .io.*;
public class lastOccurrence{
	public static int lastOccurrence(int [] arr, int target) {
		int low = 0,   high = arr.length-1;
	
		int result=-1;
		while(low<=high) {
			int mid = low +(high-low)/2;
			if(arr[mid]== target) {
				result = mid;
				// traverse to the right  side of an array
				low = mid+1;
			}
			else if(arr[mid]> target) {
				high= mid-1;
			}
			else {
				low= mid +1;
			}
		}
			return result;
		}
		
		public static void main(String[] args) {
			
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number of elements  u want to add: ");
			int n = scan.nextInt();
			
			int [] arr = new int [n];
			System.out.println("Enter the elements present in the array:");
			
			for(int i=0; i<n; i++) {
				arr[i]=scan.nextInt();
			}
			
			System.out.println("Enter the target element:");
			int target = scan.nextInt();
			
			int result = lastOccurrence(arr,target);
			if (result == -1) {
				System.out.println("Target element is not found in the array");
			}
			else {
				
				System.out.println("Target element last occurrence is present at index: "+ result);
			}
		}
			
		
		
	}
