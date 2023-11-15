package com;

public class Practice {
	
	public static long calFact(int n) {
		if (n<0) {
			return -1;
		}else if (n==0 || n==1 ) {
			return 1;
		}
		else {
			long result =1;
			for (int i =2; i<=n; i++) {
				result *=1;
			}
			return result;
			
		}
	}
	public static void main(String[] args) {
		int number = 5;
		long fact = calFact(number);
		System.out.println("factorial of "+ number + "is" + fact);
	}
}