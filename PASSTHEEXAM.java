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
		int t =  s.nextInt();
		
		for(int i =1; i <= t; i++){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    
		    if(a <10 || b <10 || c <10){
		        System.out.println("FAIL");
		    }
		    else{
		        if((a + b + c) < 100){
		            System.out.println("FAIL");   
		        }
		        else{
		            System.out.println("PASS");
		        }
		    }
		}
	}
}
