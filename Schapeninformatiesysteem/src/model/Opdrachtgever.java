package model;

public class Opdrachtgever {
	private String naam;
	private String wachtwoord;
	
	public Opdrachtgever(String nm, String ww){
		this.naam = nm;
		this.wachtwoord = ww;
	}
	
	public String getNaam(){
		return naam;
	}
	
	public void setNaam(String nm){
		this.naam = nm;
	}
	
	public String getWachtwoord(){
		return wachtwoord;
	}
	
	public void setWachtwoord(String ww){
		this.wachtwoord = ww;
	}
	
	public String toString(){
		return "Naam: " + naam + " - Wachtwoord: " + wachtwoord;
	}

}
