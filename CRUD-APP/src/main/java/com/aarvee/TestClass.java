package com.aarvee;

import java.util.Random;
import java.util.stream.IntStream;

public class TestClass {
	
	public static void main(String[] args) {
		
		//int [] numbers = new int[10];
		int n=20;
		for(int i=1;i<=60;i++)
		{
			int x= 1+(int)(Math.random()*100);
			if(i<=n)
			{
			   System.out.print(x+" ");
			}
			else
			{
				System.out.println();
				n=n+20;
				i--;
				
			}
		}
		
	}

}
