package com.hanains.guestbook.action;

import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

public class GuestBookActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		Action action = null;
		
		if(actionName.equals("insert")) {
			action = new InsertAction();
		} else if(actionName.equals("form")) {
			action = new FormAction();
		} else if(actionName.equals("delete")) {
			action = new DeleteAction();
		} else {
			action = new IndexAction();
		}
		
		return action;
	}

}
