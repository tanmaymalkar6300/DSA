package Searching;
import java.util.*;
import java.io.*;
public class Lowerbound {
    public static int findLastOccurrence(int [] arr,int target){
        int low = 0, high=arr.length-1;
       int result =-1;
       while(low<=high){
        int mid =low +(high-low)/2;
        if(arr[mid]== target){
            result=mid;
            high=mid-1;
        }
        else if(arr[mid] > target){
            high= mid-1;
        }
        else{
            low=mid+1;
        }
       }
       return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("")
    }

        
    }
}
