package com.twitter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterTest {
	
	private Twitter t;

	@Before
	public void setUp() throws Exception {
		t = new Twitter();
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	
	@Test
	public void testUnesi() {
		t.unesi("King", "cao");
		
		assertEquals("King", t.vratiSvePoruke().getLast().getKorisnik());
		assertEquals("cao", t.vratiSvePoruke().getLast().getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testUnesiNull() {
		t.unesi(null, "");
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNull() {
		t.vratiPoruke(2, null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeEmpty() {
		t.vratiPoruke(5, "");
	}

}
