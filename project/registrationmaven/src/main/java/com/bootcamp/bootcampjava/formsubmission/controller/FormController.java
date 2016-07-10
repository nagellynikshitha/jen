package com.bootcamp.bootcampjava.formsubmission.controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bootcamp.bootcampjava.formsubmission.model.J2EEStack;
import com.bootcamp.bootcampjava.formsubmission.service.FormService;

/**
 * @author Nikshitha Nagelly 
 * This class handles J2EE stack data
 */
public class FormController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		J2EEStack stack = new J2EEStack();
		stack.setYears(Integer.parseInt(request.getParameter("years")));
		stack.setJ2EELIST(request.getParameter("J2EE lIST"));
		stack.setWebservices(request.getParameter("webservices"));
		stack.setFrameworks(request.getParameter("frameworks"));
		stack.setComments(request.getParameter("Comments"));

		FormService form = new FormService();
		boolean status = form.saveDetails(stack);
		if (status == true) {
			request.getRequestDispatcher("successful.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		}

	}
}
