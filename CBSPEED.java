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
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if(x > y || x == y){
		    System.out.println("NO");
		}
		else{
		    System.out.println("YES");
		}
	}
}
