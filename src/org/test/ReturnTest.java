package org.test;

public class ReturnTest {
	
	private int sample(int a, int b, int c) {
		
		{
		if(a>b && a==c);
		{
			System.out.println("A and C value are same");
		}
					
		return b;
		}

	}
	
	public static void main(String[] args) {
		ReturnTest v=new ReturnTest();
		int sample = v.sample(5, 10, 20);
		System.out.println(sample);
	}

}
