package Raumschiff;

public class ArtikelTest {

	public static void main(String[] args) {
		Artikel art1 = new Artikel();
		Artikel art2 = new Artikel();
		
		art1.setBezeichnung("Himalayareis");
		art1.setNummer(12);
		art1.setEinkaufspreisInEuro(1.41);
		art1.setVerkaufspreisInEuro(1.78);
		art1.setSollBestand(100);
		art1.setIstBestand(90);
		
		art2.setBezeichnung("Frische Fische");
		art2.setNummer(581);
		art2.setEinkaufspreisInEuro(7.21);
		art2.setVerkaufspreisInEuro(12.45);
		art2.setSollBestand(80);
		art2.setIstBestand(77);
		
		System.out.print("Artikelname: " + art1.getBezeichnung() + "\nNummer: " + art1.getNummer() + "\nEinkaufspreis: " + art1.getEinkaufspreisInEuro() + "\nVerkaufspreis: " + art1.getVerkaufspreisInEuro() + "\nLagerbestand: " + art1.getIstBestand() + "\nSollbestand: " + art1.getSollBestand()); 
		System.out.print("\n\nArtikelname: " + art2.getBezeichnung() + "\nNummer: " + art2.getNummer() + "\nEinkaufspreis: " + art2.getEinkaufspreisInEuro() + "\nVerkaufspreis: " + art2.getVerkaufspreisInEuro() + "\nLagerbestand: " + art2.getIstBestand() + "\nSollbestand: " + art2.getSollBestand()); 

	}

}
