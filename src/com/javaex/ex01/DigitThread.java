package com.javaex.ex01;

public class DigitThread {
	
	//필드
	
	//생성자
	//DigitThread
	
	//메소드
	public void numPrint() {
		for(int i=0; i<30; i++) {
			System.out.println(i+1);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

}
