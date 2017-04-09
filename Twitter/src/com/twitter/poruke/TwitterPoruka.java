package com.twitter.poruke;

/**
 * 
 * Klasa TwitterPoruka predstavlja poruku nekog korisnika
 * na twitteru.
 * Ima nadimak korisnika i poruku korisnika.
 * 
 * @author Uros Momcilovic
 * @version 1.0
 *
 */

public class TwitterPoruka {
	
	/**
	 * Nadimak korisnika kao String
	 */
	private String korisnik;
	
	/**
	 * Sadrzaj poruke kao String
	 */
	private String poruka;
	
	/**
	 * Vraca nadimak korisnika
	 * @return nadimak korisnika kao String
	 */
	public String getKorisnik() {
		return korisnik;
	}
	
	/**
	 * Postavalja novi nadimak korisnika
	 * @param korisnik novi nadimak korisnika
	 * @throws java.lang.RuntimeException Ako je unet nadimak null
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik==null || !korisnik.isEmpty())
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}
	
	/**
	 * Vraca sadrzaj poruke korisnika
	 * @return sadrzaj poruke kao String
	 */
	public String getPoruka() {
		return "poruka";
	}
	
	/**
	 * Pstavlja novu poruku korisnika
	 * @param poruka sadrzaj nove poruke
	 * @throws java.lang.RuntimeException Ako je poruka null 
	 * ili ako je poruka String kraci od 140
	 */
	public void setPoruka(String poruka) {
		if (this.poruka==null || this.poruka == new String("") ||
				this.poruka.length()>140)
			throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	
	/**
	 * Vraca nadimak korisnika i njegovu poruku
	 * @return nadimak korisnika i njegova poruka kao String
	 */
	public String toString(){
		return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}
}
