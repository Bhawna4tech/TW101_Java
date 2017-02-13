/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


class Print{
	
	public static void main (String[] args) throws java.lang.Exception{
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		
		List<Integer> x=new ArrayList<Integer>();
		x=Prime_numbers(n);
		System.out.print("\t" + x);
	
	}
		public static List<Integer> Prime_numbers(int n){
			
			List<Integer> numbers=new ArrayList<Integer>();
			while(n%2==0){
				n=n/2;
				numbers.add(2);
			}
			
			for(int i=3;i<=Math.sqrt(n);i=i+2){
					while(n%i==0){
						numbers.add(i);
						n/=i;
					}
				}
			if(n>2)
				numbers.add(n);
				
			return numbers;
		}
		

}