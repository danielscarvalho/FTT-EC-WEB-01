package ftt.ec.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ftt.ec.api.controller.*;

/**
 * Servlet implementation class FttApi
 */
@WebServlet(description = "WEB API FTT", urlPatterns = { "/fttapi" })
public class FttApi extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private long counter;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FttApi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.counter = 100;
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("user_name");
		
		String output = "{\"now\":\"" + new Date() + "\",\"counter\":" + String.valueOf(this.counter) + ",\"userName\":\""+ name + "\"}";
				
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json"); //mime type

		response.getWriter().append(output);

		/*
		response.getWriter().append("Served at: ")
		                    .append(request.getContextPath())
		                    .append(" - ")
		                    .append(String.valueOf(new Date()))
		            
		                    .append(" - ")
		                    .append(String.valueOf(counter));
		*/
		this.counter++;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("plain/text"); //mime type
		
		int a = 0;
		int b = 0;
		
		if (request.getParameter("a") != null)
			a = Integer.valueOf(request.getParameter("a"));
		
		if (request.getParameter("b") != null)
			b = Integer.valueOf(request.getParameter("b"));
		
		response.getWriter().append(String.valueOf(a+b));

	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("plain/text"); //mime type
		
		WebTools webTools = new WebTools();
		
		response.getWriter().append("PUT recebido!! - " + new Date() + " - " + webTools.getClientIpAddress(request));
		System.out.print("PUT CHAMADO - " + new Date());
		

	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("plain/text"); //mime type
		response.getWriter().append("Registro apagado!!! ☠ " + new Date());

	}
	

    
}
