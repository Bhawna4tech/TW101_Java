/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Print{

	public static void main (String[] args) throws java.lang.Exception{
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=(n-i);j++){ //loop for space
					System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){  //loop for stars
					System.out.print("*");
			}
			System.out.println();
		}


	}
}