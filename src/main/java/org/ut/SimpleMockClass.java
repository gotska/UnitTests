package org.ut;

/**
 * Class for mock testing
 * @author Vladislav Gotska 
 */
public class SimpleMockClass {

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
	
	
}
