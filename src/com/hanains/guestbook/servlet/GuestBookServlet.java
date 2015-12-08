package com.hanains.guestbook.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.guestbook.action.GuestBookActionFactory;
import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

@WebServlet("/")
public class GuestBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		ActionFactory actionFactory = new GuestBookActionFactory();
		String actionName = "/";
		if(request.getParameter("a") != null) {
			actionName = request.getParameter("a");
		}
		
		Action action = actionFactory.getAction(actionName);
		action.excute(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
