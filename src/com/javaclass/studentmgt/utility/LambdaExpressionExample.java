package com.javaclass.studentmgt.utility;

interface GreetingService{
	
	void sayMessage(String msg1, String msg2);
	
}

public class LambdaExpressionExample {
	
	public static void main(String args[]) {
		
		GreetingService gs = (msg1 , msg2) -> { System.out.println(msg1 + " -- " + msg2); };
		
		gs.sayMessage("Hello", "Dara");
		
	}

}
