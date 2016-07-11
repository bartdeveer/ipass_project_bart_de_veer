package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Schaap;

public class SchaapDaoImpl implements SchaapDao {
	private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xe";
	private static final String DB_USER = "ipass";
	private static final String DB_PASS = "ipass";
	private Statement stmt;
	private static Connection conn;
	ResultSet rs;
	
	public SchaapDaoImpl() throws SQLException{
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
	public List<Schaap> getAllSchapen() throws SQLException {
		List<Schaap> mijnSchapen = new ArrayList<Schaap>();
		final String x = "SELECT * FROM schaap";
		rs = stmt.executeQuery(x);
		while (rs.next()) {   
			mijnSchapen.add(new Schaap((rs.getInt("oornummer")), rs.getString("geboortedatum"), rs.getString("geslacht"), rs.getInt("nlingen"), rs.getString("opmerkingen")));
		}
		rs.close();
		stmt.close();
		System.out.println("Alle eigenaren");
		return mijnSchapen;
	}
	
	
	@Override
	public void schaapToevoegen(Schaap o) throws SQLException{
		final String add = "INSERT INTO SCHAAP (oornummer, geboortedatum, geslacht, nlingen, opmerkingen) VALUES ('"+o.getOornummer()+"','"+o.getGeboortedatum()+"','"+o.getGeslacht()+"','"+o.getNlingen()+"','"+o.getOpmerkingen()+"')";
		stmt.executeUpdate(add);
		stmt.close();
		System.out.println("schaap toegevoegt");
	}
	
	@Override
	public void schaapVerwijderen(int o) throws SQLException{
		final String ver = "DELETE FROM schaap WHERE oornummer = '" + o + "'";
		stmt.executeQuery(ver);
		stmt.close();
		System.out.println("schaap verwijderd");
	}
	
	@Override
	public void schaapUpdaten(int on, String op) throws SQLException{
		final String upd = "";
		stmt.executeUpdate(upd);
		stmt.close();
		System.out.println("schaap upgedate");
	}

}
