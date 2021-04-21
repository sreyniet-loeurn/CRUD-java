package com.javaclass.studentmgt.utility;

interface Sayable {
	
	void say();
	
}

public class MethodReferenceToStaticMethod {
	
	public static void saySomething() {
		System.out.println("Hello everyone!");
	}
	
	public static void main(String args[]) {
		
		Sayable sayable = MethodReferenceToStaticMethod::saySomething;
		
		sayable.say();
		
	}

}
