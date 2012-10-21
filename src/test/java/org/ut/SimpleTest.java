package org.ut;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimpleTest {

	SimpleClass sc;
	
	@Before 
	public void initialize() {
		sc = new SimpleClass();
	    }
	 
	@Test
	   public void checkReturnString() {
	      String ret = sc.publicMethodReturnString("a", "b");
	      assertEquals(ret ,"ab");
	   }
	
	@Test
	   public void checkReturnBoolean() {
	      Boolean ret = sc.publicMethodReturnBoolean("a", "b");
	      assertTrue(ret);
	   }

}
