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
		// a is patties
		// b is bun
		// find 1 pattie and 1 bun, max burgers
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(a > b){
		        System.out.println(b);
		    }
		    else{
		        System.out.println(a);
		    }
		}
	}
}
