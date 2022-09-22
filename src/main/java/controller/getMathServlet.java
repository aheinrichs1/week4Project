package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MathOperator;

/**
 * Servlet implementation class getMathServlet
 */
@WebServlet("/getMathServlet")
public class getMathServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMathServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber1 = request.getParameter("userNumber1");
		String userOperation = request.getParameter("userOperation");
		String userNumber2 = request.getParameter("userNumber2");
		
		MathOperator mathOp = new MathOperator(userNumber1, userOperation, userNumber2);
		
		request.setAttribute("userMathOp", mathOp);
		
		getServletContext().getRequestDispatcher("/mathResult.jsp").forward(request, response);
	}

}
