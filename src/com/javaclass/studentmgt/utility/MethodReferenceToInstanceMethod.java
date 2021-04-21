package com.javaclass.studentmgt.utility;

interface Sayable1 {
	
	void say();
	
}

public class MethodReferenceToInstanceMethod {
	
	public void saySomething() {
		System.out.println("Hello everyone!");
	}
	
	public static void main(String args[]) {
		

		MethodReferenceToInstanceMethod obj = new MethodReferenceToInstanceMethod();
		
		Sayable1 sayable = obj::saySomething;
		
		sayable.say();
		
	}

}
