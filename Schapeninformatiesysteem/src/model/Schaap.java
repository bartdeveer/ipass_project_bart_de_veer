package model;

import java.util.ArrayList;

public class Schaap {
	private ArrayList<Eigenaar> deEigenaren;
	private ArrayList<Meting> deMetingen;
	private int oornummer;
	private String geboortedatum;
	private String geslacht;
	private int nlingen;
	private String opmerkingen;
	
	public Schaap(int on, String gb, String ge, int nl, String op){
		deEigenaren = new ArrayList<Eigenaar>();
		deMetingen = new ArrayList<Meting>();
		oornummer = on;
		geboortedatum = gb;
		geslacht = ge;
		nlingen = nl;
		opmerkingen = op;
	}
	
	public ArrayList<Eigenaar> getEigenaar(){
		return deEigenaren;
	}
	
	public void setEigenaar(ArrayList<Eigenaar> deEigenaar){
		deEigenaren = new ArrayList<Eigenaar>();
	}
	
	public ArrayList<Meting> getMeting(){
		return deMetingen;
	}
	
	public void setMeting(ArrayList<Meting> deMetingen){
		deMetingen = new ArrayList<Meting>();
	}
	
	public int getOornummer(){
		return oornummer;
	}
	
	public void setOornummer(int on){
		oornummer = on;
	}
	
	public String getGeboortedatum(){
		return geboortedatum;
	}
	
	public void setGeboortedatum(String gb){
		geboortedatum = gb;
	}
	
	public String getGeslacht(){
		return geslacht;
	}
	
	public void setGeslacht(String ge){
		geslacht = ge;
	}
	
	public int getNlingen(){
		return nlingen;
	}
	
	public void setNlingen(int nl){
		nlingen = nl;
	}
	
	public String getOpmerkingen(){
		return opmerkingen;
	}
	
	public void setOpmerkingen(String opm){
		opmerkingen = opm;
	}

}
