package com.javaclass.studentmgt.utility;


interface Sayable6{
	
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
	}
	
	// Abstract method
	void sayMore(String msg);
	
}

public class DefaulMethodInterface implements Sayable6{

	@Override
	public void sayMore(String msg) {
		// TODO Auto-generated method stub
		
	}

}
