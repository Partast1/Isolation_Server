package com.example.Isolation_Server.Servlets;

import com.example.Isolation_Server.Handlers.Serializer;
import com.example.Isolation_Server.Models.Location;
import com.example.Isolation_Server.Resources.LocationDAOImpl;
import com.example.Isolation_Server.Services.LocationService;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "locationServlet", value = "/location-servlet")
public class LocationServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String hej = "hejmeddig";
        Gson gson = new Gson();

        String hej2 = gson.toJson(hej);


        LocationService lService = new LocationService();
        List<String> serializedlocations = new ArrayList<String>();
        String serializedLocationsString = null;
        try {
            serializedLocationsString = lService.GetSerializedLocations();

        }catch (Exception e)
        {
System.out.println(e);
        }
        finally{
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().print(serializedLocationsString);
            response.getWriter().flush();


        }








    }
}
