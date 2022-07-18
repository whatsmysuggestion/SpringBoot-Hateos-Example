/*
 * package com.kkar.demo;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.springframework.stereotype.Component; import
 * org.springframework.web.servlet.HandlerInterceptor; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * @Component public class EmployeeInterceptor implements HandlerInterceptor {
 * 
 * @Override public boolean preHandle(HttpServletRequest
 * request,HttpServletResponse response, Object handler) throws Exception {
 * System.out.println("Entered Intereceptor"); return true; }
 * 
 * 
 * @Override public void postHandle(HttpServletRequest request,
 * HttpServletResponse response, Object handler, ModelAndView modelAndView)
 * throws Exception { System.out.println("Exited Intereceptor");
 * HandlerInterceptor.super.postHandle(request, response, handler,
 * modelAndView);
 * 
 * }
 * 
 * 
 * @Override public void afterCompletion(HttpServletRequest request,
 * HttpServletResponse response, Object handler, Exception ex) throws Exception
 * { System.out.println("Completed Intereceptor");
 * HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
 * 
 * }
 * 
 * }
 */