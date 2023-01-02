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
		// n is free space
		// x is 1GB
		// y is 2GB
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int space_GB = x*1 + y*2;
		    if(space_GB <= n){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
