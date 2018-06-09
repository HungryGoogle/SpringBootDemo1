package com.deepin.demo.filter;


import com.deepin.demo.util.log.logUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logUtil.info("=======初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        Enumeration<String> paraHeaderNames = req.getHeaderNames();
        for (Enumeration e = paraHeaderNames; e.hasMoreElements(); ) {
            String thisName = e.nextElement().toString();
            String thisValue = req.getHeader(thisName);
            logUtil.info(thisName + " -------paraHeaderNames------- " + thisValue);
        }

//        Enumeration<String> paraNames = req.getParameterNames();
//        for (Enumeration e = paraNames; e.hasMoreElements(); ) {
//            String thisName = e.nextElement().toString();
//            String thisValue = req.getParameter(thisName);
//            logUtil.info(thisName + " -------paraNames------- " + thisValue);
//        }

        long start = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        logUtil.info("filter 耗时 : " + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        logUtil.info("=======销毁过滤器=========");
    }

}