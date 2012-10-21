package org.ut;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

/**
 * Sample tests using mock (Mockito library)
 */
public class SimpleMockTest {
	
	SimpleMockClass sc;
	
	/**
	 * Set stub with help of "when()"
	 */
	@Before 
	public void initialize() {
		sc = mock(SimpleMockClass.class);
	    when(sc.publicMethodReturnString("a", "b")).thenReturn("ab");
	}
	 
	
	@Test
	   public void checkReturnString() {
	      String ret = sc.publicMethodReturnString("a", "b");
	      assertEquals(ret ,"ab");
	   }
}
