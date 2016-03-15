package com.hl.util.controller;

import com.hl.utils.editor.DateEditor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.util.Date;

public abstract class BaseController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	protected Logger logger = Logger.getLogger(this.getClass());
	@Value(value="${papper.default.limit}")
	protected int limit;
	
	@Value(value="${papper.default.start}")
	protected int start;
	
	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder)throws Exception{
		binder.registerCustomEditor(Date.class,new DateEditor());
	}
}