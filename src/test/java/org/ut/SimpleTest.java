package org.ut;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

	@Test
	   public void checkReturnString() {
	      SimpleClass sc = new SimpleClass();
	      String ret = sc.publicMethodReturnString("a", "b");
	      assertEquals(ret ,"ab");
	   }

}
