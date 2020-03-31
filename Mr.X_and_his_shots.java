import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution { 
    public static int lowerBoundSearch(int a[], int low, int high, int key)
    {
       while(low+1 < high) 
       {
           int mid = (low+high)/2;
           if(a[mid] < key)
              low = mid;
           else
              high = mid;
       }  
      return high;
    }   

   public static int upperBoundSearch(int a[], int low, int high, int key)
   {
      while(low+1 < high)
      {
         int mid = (low+high)/2;
         if(a[mid] <= key)
             low = mid;
         else
             high = mid;
      } 
      return high;
   }    

    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int[] A=new int[N];; 
    int[] B=new int[N];;
    for(int i=0;i<N;i++){
        A[i]=sc.nextInt();
        B[i]=sc.nextInt();
    }
    Arrays.sort(A);
    Arrays.sort(B);
    int str=0;
    for(int i=0;i<M;i++){
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count1 = lowerBoundSearch(B, -1, N, l);
        int count2 = N - upperBoundSearch(A, -1, N, r);
        int strength = N - (count1+count2);
        //System.out.println(strength);
        str += strength;   
    }

    System.out.println(str);
}
}
