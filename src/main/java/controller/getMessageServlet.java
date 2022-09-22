package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MessageDisplay;


/**
 * Servlet implementation class getMessageServlet
 */
@WebServlet("/getMessageServlet")
public class getMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMessageServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userMessage = request.getParameter("userMessage");
		String userSize = request.getParameter("userSize");
		String userColor = request.getParameter("userColor");
		String userFont = request.getParameter("userFont");
		
		MessageDisplay messageParameters = new MessageDisplay(userMessage, Integer.parseInt(userSize), 
															  userColor, userFont);
		
		request.setAttribute("userMessageParameters", messageParameters);
		
		getServletContext().getRequestDispatcher("/messageResult.jsp").forward(request, response);
	}

}
