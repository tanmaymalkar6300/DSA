package LinkedIn;
import java.util.*;
import java.io.*;

public class sumOfDigit {
    public static int funct(int n){
        if(n==0){
            return 0;
        }
        else{
            return ((n%10) + funct(n/10));
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();

        int result = funct(n);
        System.out.println("The sum of the digits is" + result);
    }
    
}
