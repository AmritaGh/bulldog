package edu.msstate.bulldog;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.println("<h1>Calculator WebApp</h1>");
		
		// Calculator 
		String number1 = request.getParameter("txtNum1");
		String number2 = request.getParameter("txtNum2");
		String operator = request.getParameter("operator");

		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);

		double result=0.0;

		if (operator.equals("add"))
		result = n1 + n2;

		else if (operator.equals("sub"))
		result = n1 - n2;

		else if (operator.equals("mul"))
		result = n1 * n2;

		out.println("Result: " + result);
	}

}
