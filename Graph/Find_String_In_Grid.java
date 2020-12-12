// Explanation : https://www.geeksforgeeks.org/search-a-word-in-a-2d-grid-of-characters/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int t = sc.nextInt();
		while(t-- >0){
		    int R = sc.nextInt();
		    int C = sc.nextInt();
		    char[][] mat = new char[R][C];
		    for(int i=0 ; i<R ; i++){
		        for(int j=0 ; j<C ; j++){
		            mat[i][j] = sc.next().charAt(0);
		        }
		    }
		    String x = sc.next();
		    
		    patternSearch(mat , R , C, x);
		    System.out.println();
		}
		 
	}
	
	public static void patternSearch(char[][] mat ,int R ,int C ,String x){
	    if(R == 0 || C == 0 || x.length() == 0) System.out.println("-1");
	    
	    int count1 = 0;
	    boolean found;
	    for(int row=0 ; row<R ; row++){
	        for(int col=0 ; col<C ; col++){
	           found = find(mat , row , col , x , R , C);
	           
	           if(found){
	               if(count1 == 0){
	                   System.out.print(row +" "+ col +",");
	               }
	               else{
	                   System.out.print(" "+row+" " + col + ",");
	               }
	               count1++;
	           }
	               
	       }
	    }
	    if(count1 == 0) System.out.print("-1");
	 }
	    
	
	
	public static boolean find(char[][] mat , int row , int col , String z , int R , int C){
	    int x[] = {-1,-1,-1,0,0,1,1,1};
	    int y[] = {-1, 0, 1, -1, 1, -1, 0, 1};          
	    
	    
	    if(mat[row][col] != z.charAt(0)) return false;
	    
	    int len = z.length();
	    
	    for(int dir = 0 ; dir < 8 ; dir++){
	        int k;
	        int row_dir = row + x[dir];
	        int col_dir = col + y[dir];
	        
	        for(k=1 ; k< len ; k++){
	            if(row_dir < 0 || row_dir >= R || col_dir < 0 || col_dir >= C){
	                break;
	            }
	            if(mat[row_dir][col_dir] != z.charAt(k) ){
	                break;
	            }
	            
	            row_dir += x[dir];
	            col_dir += y[dir];
	            
	           
	        }
	         if(k == len)  return true;
	    }
	    return false;
	}
}