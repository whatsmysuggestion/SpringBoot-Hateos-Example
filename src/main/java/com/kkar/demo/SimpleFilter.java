/*
 * package com.kkar.demo;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.Filter; import javax.servlet.FilterChain; import
 * javax.servlet.FilterConfig; import javax.servlet.RequestDispatcher; import
 * javax.servlet.ServletException; import javax.servlet.ServletRequest; import
 * javax.servlet.ServletResponse;
 * 
 * import org.springframework.stereotype.Component; import
 * org.springframework.web.bind.annotation.PathVariable;
 * 
 * 
 * @Component public class SimpleFilter implements Filter {
 * 
 * @Override public void init(FilterConfig filterConfig) throws ServletException
 * { System.out.println("Init-------------------");
 * 
 * }
 * 
 * @Override public void doFilter(ServletRequest request, ServletResponse
 * response, FilterChain chain) throws IOException, ServletException {
 * System.out.println("Validation-------------------");
 * 
 * 
 * //chain.doFilter(request, response);
 * 
 * int eid=4; if(eid>3) response.getWriter().print("No Records Found"); else
 * chain.doFilter(request, response);
 * 
 * 
 * }
 * 
 * @Override public void destroy() {
 * System.out.println("De allocation----------------------");
 * 
 * }
 * 
 * }
 * 
 */