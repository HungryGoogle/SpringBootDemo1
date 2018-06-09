package com.deepin.demo.filter;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        Enumeration<String> paraNames = request.getParameterNames();
        for (Enumeration e = paraNames; e.hasMoreElements(); ) {
            String thisName = e.nextElement().toString();
            String thisValue = request.getParameter(thisName);
            System.out.println(thisName + " -------------- " + thisValue);
        }

        long start = System.currentTimeMillis();

        filterChain.doFilter(request, response);

        System.out.println("leeTest---------> filter 耗时：" + (System.currentTimeMillis() - start));

    }

    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器=========");
    }

}