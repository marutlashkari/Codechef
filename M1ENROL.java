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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    int require = y - x;
		    
		    if(x < y){
		        System.out.println(require);
		    }
		    else{
		        System.out.println(0);
		    }
		}
		
	}
}
