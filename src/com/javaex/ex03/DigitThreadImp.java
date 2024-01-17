package com.javaex.ex03;

public class DigitThreadImp implements Runnable {

		public void run() {
			for(int i=0; i<=20; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

	}

}
