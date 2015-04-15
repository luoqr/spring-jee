package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@WebServlet(value="/hello",
initParams = {
   @WebInitParam(name="foo", value="Hello "),
   @WebInitParam(name="bar", value=" World!")
})
public class MyHttpServlet extends GenericServlet  {

	
	public void service(ServletRequest req, ServletResponse res)
		    throws IOException, ServletException
		  {
		    PrintWriter out = res.getWriter();
		    out.println(getInitParameter("foo"));
		    out.println(getInitParameter("bar")) ;
		    
		    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfiguration.class);
			CustomerService service = ctx.getBean(CustomerService.class);
			System.out.println(service);
			Customer c = service.query("1");
			System.out.println(c) ;
		    
		  }
	
}
