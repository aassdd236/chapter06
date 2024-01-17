package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		DigitThreadImp dt=new DigitThreadImp();
		
		Thread thread=new Thread(dt);
		thread.start();
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
