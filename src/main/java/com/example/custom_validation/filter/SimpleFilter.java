package com.example.custom_validation.filter;

import jakarta.servlet.*;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import java.io.IOException;


@Component
@Order(1)
public class SimpleFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        System.out.println("order1");
        System.out.println("remote host" + " " + servletRequest.getRemoteHost());
        System.out.println("remote address" + " " + servletRequest.getRemoteAddr());

        System.out.println("local request address" + " " + servletRequest.getLocalAddr());
        System.out.println("request ID" + " " + servletRequest.getRequestId());
        System.out.println("request content type" + " " + servletRequest.getContentType());

        filterChain.doFilter(servletRequest, servletResponse);


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

}

