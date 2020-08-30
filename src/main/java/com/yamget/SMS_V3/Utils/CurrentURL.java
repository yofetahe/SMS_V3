package com.yamget.SMS_V3.Utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class CurrentURL {
	
	public static String getCurrentURL(){
		
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		
		String url = request.getRequestURI().toString();
		
		int index = url.indexOf("BAS") - 1;
			
		url = url.substring(index);
		
		return url;
	}

}
