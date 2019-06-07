package helloServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletExample
 */


@WebServlet(name= "MyServletExample", urlPatterns= {"/MyServletExample"})
public class MyServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*This write out to the browser.*/
		PrintWriter output =response.getWriter();
		response.setContentType("text/html");
		
		String usersName= request.getParameter("yourname");
		String theLang= request.getParameter("Language");
		int firstNum= Integer.parseInt(request.getParameter("firstnum"));
		int secondNum= Integer.parseInt(request.getParameter("secondnum"));
		int sumOfNum=firstNum + secondNum;
		
		
		/*This block of code is what is going to be displayed in the browser.*/
		output.println("<html><body><h3>Hello " + usersName);
		output.println("</h3><br/>" + firstNum + "+" + secondNum);
		output.println("=" + sumOfNum + "<br/>Speaks " + theLang + "</body></html>");
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter output= response.getWriter();
		output.println("This resource is not available directly");
		//doGet(request, response);
		
	
	}

}
