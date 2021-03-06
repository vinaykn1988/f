package com.brillio.training.web.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TodayTag extends TagSupport {

	private static final long serialVersionUID = 1L;
	
	private String pattern;
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public int doStartTag() throws JspException {
		// pageContext.getOut() returns the same "out"
		// implicit object being used in the JSP where
		// this tag has been used. pageContext is a 
		// protected member variable in the TagSupport
		// class, and is accessible in subclasses
		JspWriter out = pageContext.getOut();
		
		Date dt = new Date();
		try{
			if(pattern==null){
				out.print(dt);	
			}
			else{
				
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				out.print(sdf.format(dt));
			}
			
			
		}catch(IOException e){
			
		}
		return super.doStartTag();
	}
}
