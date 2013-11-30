package com.canecaria.controller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("")
public class AuthenticationFIlter implements Filter {

	@Override
	public void destroy( ) {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {

		
//		HttpServletRequest req = (HttpServletRequest) request;
//        Authorization auth = (Authorization) req.getSession().getAttribute("auth");
//
//        if (auth != null && auth.isLoggedIn()) {
//            // User is logged in, so just continue request.
//            filter.doFilter(request, response);
//        } else {
//            // User is not logged in, so redirect to index.
//            HttpServletResponse res = (HttpServletResponse) response;
//            res.sendRedirect(req.getContextPath() + "/index.xhtml");
//        }
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
