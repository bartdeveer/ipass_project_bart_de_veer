package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.Eigenaar;

public class EigenaarDaoImpl implements EigenaarDao{
	private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private static final String DB_USER = "ipass";
	private static final String DB_PASS = "ipass";
	private Statement stmt;
	private static Connection conn;
	
	ResultSet rs;
	
	public EigenaarDaoImpl() throws SQLException{
		try{
			Class.forName(DB_DRIV).newInstance();
		}
		catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1){
			e1.printStackTrace();
		}
		 conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		 stmt = conn.createStatement();
		 System.out.println("Connection made!");
		}
	
	@Override
	public List<Eigenaar> getAllEigenaars() throws SQLException {
		List<Eigenaar> mijnEigenaars = new ArrayList<Eigenaar>();
		final String x = "SELECT * FROM eigenaar";
		rs = stmt.executeQuery(x);
		while (rs.next()) {   
			mijnEigenaars.add(new Eigenaar((rs.getString("voornaam")), rs.getString("tussenvoegsel"), rs.getString("achternaam"), rs.getString("wachtwoord")));
		}
		rs.close();
		stmt.close();
		System.out.println("Alle eigenaren");
		return mijnEigenaars;
	}
	
	@Override
	public void eigenaarToevoegen(Eigenaar o) throws SQLException {
		final String x = "INSERT INTO eigenaar (voornaam, tussenvoegsel, achternaam, wachtwoord) VALUES ('"+o.getVoornaam()+"','"+o.getTussenvoegsel()+"','"+o.getAchternaam()+"','"+o.getWachtwoord()+"')";
		stmt.executeUpdate(x);
		stmt.close();
		System.out.println("Nieuwe eigenaar aangemaakt");
	}
}
