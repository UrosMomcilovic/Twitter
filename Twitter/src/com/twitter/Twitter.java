package com.twitter;

import java.util.LinkedList;
import com.twitter.poruke.TwitterPoruka;
/**
 * Klasa Twitter sadrzi listu svih poruka
 * @author Uros Momcilovic
 * @version 1.0
 *
 */
public class Twitter {
	/**
	 * Lista svih poruka
	 */
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();
	
	/**
	 * Vraca listu svih poruka	
	 * @return sve poruke kao ulancanu listu
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke(){
		return poruke;
	}
	
	/**
	 * Izvrsava unos poruke nekog korisnika u listu poruka
	 * @param korisnik nadimak korisnika
	 * @param poruka poruka korisnika
	 */
	public void unesi(String korisnik, String poruka) {
		//Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik("korisnik");
		tp.setPoruka(poruka);
		//Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}
	
	/**
	 * Pretrazuje listu poruka i vraca sve u kojima postoji tag koji je
	 * dat kao parametar. Max broj poruka se ogranicava brojem koji se 
	 * unosi kao parametar.
	 * @param maxBroj maksimalan povratni broj poruka
	 * @param tag tag koji se trazi u porukama
	 * @return vraca niz poruka koji sadrze dati trag
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag==null || tag.isEmpty())
		throw new RuntimeException("Morate uneti tag");
		
		//Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj<=0)
		maxBroj = 100;
		
		 //Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		//Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		//sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		//Pretrazuju se poruke i traze se one koje sadrze tag.
		//Ako se nadje neka takva, i ako nije prekoracen maxBroj
		//ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		//se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag)!=-1)
				if (brojac < maxBroj){
					rezultat[brojac+1]=poruke.get(i);
					brojac++;
		}else break;
		return rezultat;
	}
} 