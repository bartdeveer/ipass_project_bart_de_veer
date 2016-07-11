package dao;

import java.sql.SQLException;
import java.util.List;

import model.Eigenaar;

public interface EigenaarDao {
	public List<Eigenaar> getAllEigenaars() throws SQLException;
	public void eigenaarToevoegen(Eigenaar o) throws SQLException;

}
