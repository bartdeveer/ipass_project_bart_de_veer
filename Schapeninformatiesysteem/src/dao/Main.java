 package dao;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import model.Eigenaar;

public class Main {
	
	static EigenaarDao studDB;
	
	public static void main(String[] args) throws SQLException, ParseException {
	
		studDB = new EigenaarDaoImpl();
		
		printAllEigenaars();
	}
	public static void printAllEigenaars() throws SQLException{
		List<Eigenaar> c = studDB.getAllEigenaars();
		for(Eigenaar cu : c){
			System.out.println(cu);
		
		}
	}
}
