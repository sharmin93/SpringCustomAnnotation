package com.example.custom_validation.filter;

import com.example.custom_validation.controller.ColorController;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import org.apache.log4j.Logger;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


@WebFilter(urlPatterns = "/*",initParams = {
        @WebInitParam(name = "username",value = "b1")   ,
        @WebInitParam(name = "pass",value = "1")   ,
})

public class webSimpleFilter implements Filter {
    static Logger logger = Logger.getLogger(webSimpleFilter.class);
    FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        this.filterConfig = filterConfig;
        filterConfig.getServletContext().log("init");
        String username = filterConfig.getInitParameter("username");
        String password = filterConfig.getInitParameter("pass");

        // Print the init parameter
        System.out.println("Username -- " + " " + username);
        System.out.println("password -- " + " " + password);

    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Time " + new Date().toString());
        logger.info("servletReqRequests" + servletRequest);
        logger.info("servletResponse" + servletResponse);
        logger.info("time" + new Date().toString());

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
