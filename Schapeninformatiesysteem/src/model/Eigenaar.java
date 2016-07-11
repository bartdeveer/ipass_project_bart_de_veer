package model;

public class Eigenaar {
	private String voornaam;
	private String tussenvoegsel;
	private String achternaam;
	private String wachtwoord;
	
	public Eigenaar(String vn, String tv, String an, String ww){
		voornaam = vn;
		tussenvoegsel = tv;
		achternaam = an;
		wachtwoord = ww;
	}
	
	public String getVoornaam(){
		return voornaam;
	}
	
	public void setVoornaam(String vn){
		voornaam = vn;
	}
	
	public String getTussenvoegsel(){
		return tussenvoegsel;
	}
	
	public void setTussenvoegsel(String tv){
		tussenvoegsel = tv;
	}
	
	public String getAchternaam(){
		return achternaam;
	}
	
	public void setAchternaam(String an){
		achternaam = an;
	}
	
	public String getWachtwoord(){
		return wachtwoord;
	}
	
	public void setWachtwoord(String ww){
		wachtwoord = ww;
	}

}
