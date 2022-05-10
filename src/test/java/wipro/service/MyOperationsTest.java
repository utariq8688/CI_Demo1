package wipro.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyOperationsTest {

	@Test
	public void testGetSummation() {
		assertEquals(8, new MyOperations().getSummation(3, 5));
	}
	
	@Test
	public void testGetSummation1() {
		assertEquals(16, new MyOperations().getSummation(9, 7));
	}
	
	@Test
	public void testGetSummation2() {
		assertEquals(51, new MyOperations().getSummation(46, 5));
	}
	
	@Test
	public void testGetFullName() {
		assertEquals("Prabhu Jeypal", new MyOperations().getFullName("Prabhu", "Jeypal"));
	}
	
	@Test
	public void testGetFullName1() {
		assertEquals("Jeypal", new MyOperations().getFullName(null, "Jeypal"));
	}
	
	@Test
	public void testGetFullName2() {
		assertEquals("Prabhu", new MyOperations().getFullName("Prabhu", null));
	}

}
