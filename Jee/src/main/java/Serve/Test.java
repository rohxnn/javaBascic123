package Serve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Test() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println(" <form action=\"action_page.php\" style=\"border:1px solid #ccc\">\r\n"
				+ "            <div class=\"container\">\r\n"
				+ "              <h1>Sign Up</h1>\r\n"
				+ "              <p>Please fill in this form to create an account.</p>\r\n"
				+ "              <hr>\r\n"
				+ "          \r\n"
				+ "              <label for=\"email\"><b>Email</b></label>\r\n"
				+ "              <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\r\n"
				+ "          \r\n"
				+ "              <label for=\"psw\"><b>Password</b></label>\r\n"
				+ "              <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\r\n"
				+ "          \r\n"
				+ "              <label for=\"psw-repeat\"><b>Repeat Password</b></label>\r\n"
				+ "              <input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" required>\r\n"
				+ "          \r\n"
				+ "              <label>\r\n"
				+ "                <input type=\"checkbox\" checked=\"checked\" name=\"remember\" style=\"margin-bottom:15px\"> Remember me\r\n"
				+ "              </label>\r\n"
				+ "          \r\n"
				+ "              <p>By creating an account you agree to our <a href=\"#\" style=\"color:dodgerblue\">Terms & Privacy</a>.</p>\r\n"
				+ "          \r\n"
				+ "              <div class=\"clearfix\">\r\n"
				+ "                <button type=\"button\" class=\"cancelbtn\">Cancel</button>\r\n"
				+ "                <button type=\"submit\" class=\"signupbtn\">Sign Up</button>\r\n"
				+ "              </div>\r\n"
				+ "            </div>\r\n"
				+ "          </form>\r\n"
				+ "    </div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
