package org.ut;

public class SimpleClass {

	public String publicMethodReturnString (String a, String b){
		String ret;
		ret=a+b;
		return ret;
	}
	
	public boolean publicMethodReturnBoolean (String a, String b){
		if(a!=b){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		SimpleClass sc = new SimpleClass();
		String str = sc.publicMethodReturnString("a", "b");
		System.out.println("Simple concat: "+ str);
	}

}
