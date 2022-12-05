package week2.day1;

import java.util.concurrent.ForkJoinPool;

public class FibonacciSeries {
		public static void main(String[] args) {
	int range = 8;
	int a=0;
	int b=1;
	int c=a+b;
	for(int i=0;i<range;i++)
	{
		System.out.println(a);
		a=b;
		b=c;
		c=a+b;
	}
		}
	}
