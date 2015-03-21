import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.http.*;



public class DefectTrackerServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		
		
		
	}

	
	public void doGetEmail(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		try {
			RequestDispatcher dispatcher = getServletConfig().getServletContext().getNamedDispatcher("/jsp/email.jsp");
			
			// Set Defect
			Class.forName("com.mysql.jdbc.Driver");

			// Make a Connection to the Database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","test_user", "testpassword");

			// Create a Statement
			Statement statement = connection.createStatement();

			// Now select one random result from messages
			String queryString	= "SELECT * FROM WHERE id == " + request.getParameter("defect_id");
			statement.execute(queryString);
		
			// Process the Results
			// I am not sure how to set the resultSet directly to an object -- Should we use Hibernate?
			Defect defect 		= new Defect();

			// Set Attributes
			String message = "The status for the defect you submitted is: " + defect.status;
			request.setAttribute("subject", "Defect Status");
			request.setAttribute("message", message);
			dispatcher.forward(request, response);
			
			// Close the Statement and Connection
			statement.close();
			connection.close();
		}
		catch (SQLException se) {
			se.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}