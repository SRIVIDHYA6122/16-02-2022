package com.array;

public class SumAndAverage {
	public static void main(String [] args)
	{
		int[] n= {2,4,5,6,7,9};
		int sum=0;
		double average;
		for( int N:n)
			sum+=N;
		int length = n.length;
		average= ((double)(sum) /(double)(length));
		System.out.println("sum:"+sum);
		System.out.println("average:"+average);
	}

}
