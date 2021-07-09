package com.example.Isolation_Server.Handlers;

import com.example.Isolation_Server.Models.Location;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;

public class DBHandler {

    String constring = "127.0.0.1:3306;Database=TestDB;Uid=root;Pwd=P@ssW0rd";
    private Connection Connect(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/BiografDB","root","P@ssW0rd");
            return con;
        }catch(Exception e){ System.out.println(e);}


        return null;
    }
    public Location ReadPosition(){

        Location location = null;

        Connection con = Connect();
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select Latitude, Longitude from Coordinates");

            while(rs.next())
            location = new Location(rs.getDouble("Latitude"),rs.getDouble("Longitude"));
            System.out.println("Lati:" + rs.getString(1)+"  "+ "Long:" + rs.getString(2));
            con.close();

        }
        catch(Exception e){ System.out.println(e);}
        finally{
            return location;

        }
    }
    public List<Location> ReadPositions(){

        List<Location> locations = new ArrayList<Location>();

        Connection con = Connect();
        try{
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select Latitude, Longitude from Coordinates");

            while(rs.next())
            locations.add(new Location(rs.getDouble("Latitude"),rs.getDouble("Longitude")));
//            System.out.println("Lati:" + rs.getString(1)+"  "+ "Long:" + rs.getString(2));
            con.close();

        }
        catch(Exception e){ System.out.println(e);}
        finally{
            return locations;

        }
    }
    public void NewLocation(Location location) throws SQLException {


        Connection con = Connect();
        String sql = "INSERT INTO Coordinates (Latitude, Longitude) values (?, ?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setDouble(1, location.getLatitude());
        statement.setDouble(2, location.getLongitude());

        statement.executeUpdate();


    }



}

