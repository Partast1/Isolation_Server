package com.example.Isolation_Server;

import com.example.Isolation_Server.Handlers.DBHandler;
import com.example.Isolation_Server.Models.Location;

import java.io.*;
import java.net.ServerSocket;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;


    public void init() {
        DBHandler handler = new DBHandler();
        Location location = handler.ReadPosition();
        message = "";


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        DBHandler handler = new DBHandler();
        handler.ReadPosition();
    }

    public void destroy() {
    }
}
