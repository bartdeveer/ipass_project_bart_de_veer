package model;

public class Meting {
	private String datum;
	private double gewicht;
	
	public Meting(String d, double ge){
		datum = d;
		gewicht = ge;
	}
	
	public String getDatum(){
		return datum;
	}
	
	public void setDatum(String d){
		datum = d;
	}
	
	public double getGewicht(){
		return gewicht;
	}
	
	public void setGewicht(double ge){
		gewicht = ge;
	}
}
