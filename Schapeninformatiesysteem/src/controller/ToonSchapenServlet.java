package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SchaapDao;
import dao.SchaapDaoImpl;
import model.Schaap;

public class ToonSchapenServlet extends HttpServlet{
static SchaapDao studDB;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Schaap> o;
		
		try {
			studDB = new SchaapDaoImpl();
			o = studDB.getAllSchapen();
		} catch (SQLException e1) {
			e1.printStackTrace();
			o = new ArrayList<Schaap>();
		}

		req.setAttribute("schapen", o);
		
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/toon-schapen.jsp");
		
		view.forward(req, resp);
		
	}

}
