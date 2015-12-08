package com.hanains.guestbook.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.guestbook.dao.GuestBookDao;
import com.hanains.http.action.Action;

public class DeleteAction implements Action {
	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no = request.getParameter("no");
		String password = request.getParameter("password");
		new GuestBookDao().delete(Long.parseLong(no), password);

		response.sendRedirect("?");
	}
}
