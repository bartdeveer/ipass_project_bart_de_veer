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

public class EigenaarToevoegenServlet extends HttpServlet {
	
	static EigenaarDao studDB;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/eigenaar-toevoegen.jsp");
		
		view.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			studDB = new EigenaarDaoImpl();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String voornaam = req.getParameter("voornaam");
		String tussenvoegsel = req.getParameter("tussenvoegsel");
		String achternaam = req.getParameter("achternaam");
		String wachtwoord = req.getParameter("wachtwoord");
		
		Eigenaar o = new Eigenaar(voornaam, tussenvoegsel, achternaam, wachtwoord);
		
		try {
			studDB.eigenaarToevoegen(o);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		resp.sendRedirect("/Schapeninformatiesysteem/index.jsp");
	}
}
