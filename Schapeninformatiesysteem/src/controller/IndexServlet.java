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

public class IndexServlet extends HttpServlet {
	
	static EigenaarDao studDB;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Eigenaar> o;
		
		try {
			studDB = new EigenaarDaoImpl();
			o = studDB.getAllEigenaars();
		} catch (SQLException e1) {
			e1.printStackTrace();
			o = new ArrayList<Eigenaar>();
		}

		req.setAttribute("eigenaars", o);
		
		RequestDispatcher view = req.getRequestDispatcher("WEB-INF/index.jsp");
		
		view.forward(req, resp);
		
	}
}
