package com.javaclass.studentmgt.utility;

interface Messageable {
	
	Message getMessage(String msg);
	
}

class Message{
	
	Message(String msg){
		System.out.print(msg);
	}
	
}

public class MethodReferenceToConstructor {
	
	public static void main(String args[]) {

		Messageable messageable = Message::new;
		messageable.getMessage("hello");
		
	}

}
