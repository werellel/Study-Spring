package com.javalec.ex;

public class Calculation {
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		System.out.println("add");
		System.out.println((firstNum + secondNum));
	}
	
	public void sub() {
		System.out.println("sub");
		System.out.println((firstNum - secondNum));
		
	}
	
	public void mul() {
		System.out.println("mul");
		System.out.println((firstNum * secondNum));
			
		}
		
	public void div() {
		System.out.println("mul");
		System.out.println((firstNum / secondNum));
		
	}
	

}
