package Serve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class log
 */
@WebServlet("/log")
public class log extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public log() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name="shiju";
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n"
				+ "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js\" integrity=\"sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ\" crossorigin=\"anonymous\"></script>\r\n"
				+ "    <link rel=\"stylesheet\" href=\"log.css\">\r\n"
				+ "    <style>\r\n"
				+ "      body {\r\n"
				+ "    background: black;\r\n"
				+ "	/* background: linear-gradient(-45deg, #380224, #1d2023, #02081e, #095a47); */\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ ".container-fluid\r\n"
				+ "{\r\n"
				+ "   margin: 0;\r\n"
				+ "    padding: 0;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".up\r\n"
				+ "{\r\n"
				+ "    max-width: 100%;\r\n"
				+ "    height: 9vh;\r\n"
				+ "    border-style: solid;\r\n"
				+ "    width: 100%;\r\n"
				+ "    height: 9vh;\r\n"
				+ "    border-style: solid;\r\n"
				+ "   \r\n"
				+ "}\r\n"
				+ ".log\r\n"
				+ "{\r\n"
				+ "    width: 35%;\r\n"
				+ "    min-height: 58%;\r\n"
				+ "    position: absolute;\r\n"
				+ "    right: 145px;\r\n"
				+ "    top: 152px;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ ".a \r\n"
				+ "{\r\n"
				+ "    border-color:  #215c41;\r\n"
				+ "    -webkit-background-clip: text;\r\n"
				+ "    -webkit-text-fill-color: transparent;\r\n"
				+ "    border-width: 4px;\r\n"
				+ "}\r\n"
				+ "    </style>\r\n"
				+ "    <title>Login</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "  <div class=\"container-fluid\">\r\n"
				+ "    <!-- <img src=\"clip.avif\" alt=\"\" id=\"a\"> -->\r\n"
				+ "    <div class=\"up\">\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"log\" style=\"border-style: solid;\">\r\n"
				+ "        <form>\r\n"
				+ "            <div class=\"mb-3\" style=\"color:#215c41\">\r\n"
				+ "              <label for=\"exampleInputEmail1\" class=\"form-label\"><b> "+name+"</b></label>\r\n"
				+ "              <input type=\"email\" class=\"form-control a\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\">\r\n"
				+ "             \r\n"
				+ "              <div id=\"emailHelp\" class=\"form-text\" style=\"color: #215c41;\">We'll never share your email with anyone else.</div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"mb-3\" style=\"color: white;\">\r\n"
				+ "              <label for=\"exampleInputPassword1\" class=\"form-label\" style=\"color: #215c41;\"><b>Password</b></label>\r\n"
				+ "              <input type=\"password\" class=\"form-control a\" id=\"exampleInputPassword1\" >\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"mb-3 form-check\">\r\n"
				+ "              <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\r\n"
				+ "              <label class=\"form-check-label\" for=\"exampleCheck1\" style=\"color: #215c41;\">Check me out</label>\r\n"
				+ "            </div>\r\n"
				+ "            <button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n"
				+ "          </form>\r\n"
				+ "\r\n"
				+ "    </div>\r\n"
				+ "           <img src=\"https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_960_720.jpg\" alt=\"marathil koore pookal\">\r\n"
				+ "  </div>\r\n"
				+ "    \r\n"
				+ "</body>\r\n"
				+ "</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
