/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		    int x = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    long rs = a + b;
		    if(rs <= x){
		        System.out.println("Yes");
		    }
		    else{
		        System.out.print("No");
		    }

	}
}
