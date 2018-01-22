package com.claudio.backendninja.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter {

    private static final Log LOOGER = LogFactory.getLog(RequestTimeInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        request.setAttribute("startTime", System.currentTimeMillis());

        return super.preHandle(request, response, handler);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        long starTime = (long) request.getAttribute("starTime");

        LOOGER.info("--REQUEST URL : '" + request.getRequestURL() + "' -- TOTAL TIME : '" + (System.currentTimeMillis() - starTime) + "'ms");
    }
}
