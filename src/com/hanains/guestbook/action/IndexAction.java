package com.hanains.guestbook.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hanains.guestbook.dao.GuestBookDao;
import com.hanains.guestbook.vo.GuestBookVo;
import com.hanains.http.HttpUtil;
import com.hanains.http.action.Action;

public class IndexAction implements Action {
	@Override
	public void excute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<GuestBookVo> list = new GuestBookDao().getList();
		
		request.setAttribute("list", list);
		
		// forwarding
		HttpUtil.forwarding(request, response, "/WEB-INF/views/index.jsp");
	}
}
