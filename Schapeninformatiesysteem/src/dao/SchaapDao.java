package dao;

import java.sql.SQLException;
import java.util.List;

import model.Schaap;

public interface SchaapDao {
	public List<Schaap> getAllSchapen() throws SQLException;
	public void schaapToevoegen(Schaap o) throws SQLException;
	public void schaapVerwijderen(int o) throws SQLException;
	public void schaapUpdaten(int on, String op) throws SQLException;
	

}
