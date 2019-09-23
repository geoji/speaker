package org.geoji.app.speaker;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.googlecode.jsonrpc4j.JsonRpcServer;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet{
    private HelloService helloService;
    private JsonRpcServer jsonRpcServer;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>Single Hello from HelloServlet</h1>");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        jsonRpcServer.handle(req, resp);
    }

    public void init(ServletConfig config) {
        this.helloService = new HelloService();
        
        // Make the methods of HelloService available via json-rpc
        this.jsonRpcServer = new JsonRpcServer(new ObjectMapper(), this.helloService, HelloService.class);
    }
}
