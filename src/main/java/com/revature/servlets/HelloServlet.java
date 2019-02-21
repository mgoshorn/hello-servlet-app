package com.revature.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

/*
 * Interface: Servlet
 * 
 * GenericServlet
 * HttpServlet
 * DefaultServlet
 * YourServlet
 *
 */

/**
 * Requests get sent to a service method.
 * HttpServlet/DefaultServlet have this method implemented already
 * and it automatically delegates to appropriate Http actions.
 * Such that for:
 * POST -> doPost
 * GET -> doGet
 * PUT -> doPut
 * DELETE -> doDelete
 * 
 *
 */
public class HelloServlet extends DefaultServlet {
		
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Request received!");
		response.getWriter().write("Hello!");
	}
}
