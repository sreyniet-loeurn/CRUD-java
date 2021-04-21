package com.javaclass.studentmgt.utility;

@FunctionalInterface
interface Sayable5{
	
	void say(String msg);
	
}

public class FunctionInterface implements Sayable5{

	@Override
	public void say(String msg) {
		// TODO Auto-generated method stub
		System.out.print("Woof Woof");
	}
	
	public static void main(String args[]) {
		
		FunctionInterface fi = new FunctionInterface();
		
		fi.say("Normal ");
		
		
	}

}
