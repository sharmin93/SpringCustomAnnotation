package com.example.custom_validation.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


import java.io.IOException;

@Component
public class RequestResponseLoggingFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        System.out.println("order 2");
        System.out.println("Logging Request  {} : {}" + "" + req.getMethod() + req.getRequestURI());

        System.out.println("Logging Response :{}" + "c " + res.getContentType());
        chain.doFilter(request, response);
    }

    // other methods

    @Bean
    public FilterRegistrationBean<RequestResponseLoggingFilter> loggingFilterFilterReg() {
        FilterRegistrationBean<RequestResponseLoggingFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new RequestResponseLoggingFilter());
        registrationBean.addUrlPatterns("/hello");
        registrationBean.setOrder(2);
        return registrationBean;

    }
}