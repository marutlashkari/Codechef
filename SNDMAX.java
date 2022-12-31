/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++){
		    int n1 = sc.nextInt();
		    int n2 = sc.nextInt();
		    int n3 = sc.nextInt();
		    
		    int second_max;
		    if((n1 > n2 || n1 > n3) && (n1 < n2 || n1 < n3)){
		        second_max = n1;
		        System.out.println(second_max);
		    }
		    else if((n2 > n1 || n2 > n3) && (n2 < n1 || n2 < n3)){
		        second_max = n2;
		        System.out.println(second_max);
		    }
		    else{
		        second_max = n3;
		        System.out.println(second_max);
		    }
		    
		}
	}
}
