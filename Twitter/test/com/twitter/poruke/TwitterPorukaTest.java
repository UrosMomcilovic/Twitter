/**
 * 
 */
package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwitterPorukaTest {
	
	private TwitterPoruka t;


	@Before
	public void setUp() throws Exception {
		t = new TwitterPoruka();
	}

	
	@After
	public void tearDown() throws Exception {
		t = null;
	}


	@Test
	public void testSetKorisnik() {
		t.setKorisnik("King");
		
		assertEquals("King", t.getKorisnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		
		t.setKorisnik(null);
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikEmpty() {
		
		t.setKorisnik("");
		
	}
	
	@Test
	public void testSetPoruka() {
		t.setPoruka("pozdrav");
		
		assertEquals("pozdrav", t.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		
		t.setPoruka(null);
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaEmpty() {
		
		t.setPoruka("");
		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaBigString() {
		
		t.setPoruka("Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented,[14] and specifically designed to have as few implementation dependencies as possible.");
		
	}

	
	@Test
	public void testToString() {
		t.setKorisnik("King");
		t.setPoruka("pozdrav");
		
		assertEquals("KORISNIK:"+t.getKorisnik()+" PORUKA:"+t.getPoruka(), t.toString());
		
	}

}
