/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Print{
	
	public static void main (String[] args) throws java.lang.Exception{
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
					System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
}

 