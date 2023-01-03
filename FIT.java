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
		 // x is km form is home
		 // 5 days open in week
		 // find no of km, go to home and return to home km is count 2 time's
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 
		 for(int i = 1; i <= t; i++){
		     int x = sc.nextInt();
		     int total_km = x + x;
		     System.out.println(total_km*5);
		 }
	}
}
