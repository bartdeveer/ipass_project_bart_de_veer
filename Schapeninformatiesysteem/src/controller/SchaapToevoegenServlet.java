package controller;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import model.*;

public class SchaapToevoegenServlet extends HttpServlet{
	
static SchaapDao studDB;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/schaap-toevoegen.jsp");
		
		view.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			studDB = new SchaapDaoImpl();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int oornummer = Integer.parseInt(req.getParameter("oornummer"));
		String geboortedatum = req.getParameter("geboortedatum");
		String geslacht = req.getParameter("geslacht");
		int nlingen = Integer.parseInt(req.getParameter("nlingen"));
		String opmerkingen = req.getParameter("opmerking");
		
		Schaap o = new Schaap(oornummer, geboortedatum, geslacht, nlingen, opmerkingen);
		
		try {
			studDB.schaapToevoegen(o);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("/Schapeninformatiesysteem/toon-schapen.jsp");
	}
}


