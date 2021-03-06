package com.deepin.demo.filter;


import com.deepin.demo.util.log.LogUtil;

import javax.servlet.*;
import java.io.IOException;

public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LogUtil.info("=======初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
            throws IOException, ServletException {

//        // 打印请求头部
//        HttpServletRequest req = (HttpServletRequest) request;
//        Enumeration<String> paraHeaderNames = req.getHeaderNames();
//        for (Enumeration e = paraHeaderNames; e.hasMoreElements(); ) {
//            String thisName = e.nextElement().toString();
//            String thisValue = req.getHeader(thisName);
//            LogUtil.info(thisName + " -------paraHeaderNames------- " + thisValue);
//        }

//        Enumeration<String> paraNames = req.getParameterNames();
//        for (Enumeration e = paraNames; e.hasMoreElements(); ) {
//            String thisName = e.nextElement().toString();
//            String thisValue = req.getParameter(thisName);
//            LogUtil.info(thisName + " -------paraNames------- " + thisValue);
//        }

        long start = System.currentTimeMillis();
        filterChain.doFilter(request, response);
        LogUtil.info("filter 耗时 : " + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        LogUtil.info("=======销毁过滤器=========");
    }

}