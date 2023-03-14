package Raumschiff;

public class Artikel {
	private String bezeichnung;
	private int nummer; 
	private double einkaufspreisInEuro;
	private double verkaufspreisInEuro;
	private int sollBestand;
	private int istBestand;
	
	public Artikel () {	}
	
	public String getBezeichnung() {
		return bezeichnung;
	}

	public int getNummer() {
		return nummer;
	}
	
	public double getEinkaufspreisInEuro() {
		return einkaufspreisInEuro;
	}
	
	public double getVerkaufspreisInEuro() {
		return verkaufspreisInEuro;
	}
	
	public int getSollBestand() {
		return sollBestand;
	}
	
	public int getIstBestand() {
		return istBestand;
	}
	
	
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
	
	public void setVerkaufspreisInEuro(double verkaufspreis) {
		verkaufspreisInEuro = verkaufspreis;
	}
	
	public void setEinkaufspreisInEuro(double einkaufspreis) {
		einkaufspreisInEuro = einkaufspreis;
	}
	
	public void setSollBestand(int sollBestand) {
		this.sollBestand = sollBestand;
	}
	
	public void setIstBestand(int istBestand) {
		this.istBestand = istBestand;
	}
	
	public void bestellen() {
		if (istBestand >= sollBestand * 0.8) {
			istBestand = sollBestand;
		}
	}
		
	public double gewinnBerechnen() {
		return verkaufspreisInEuro - einkaufspreisInEuro;
		}
}
