/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Yogesh
 */
public class CheckUNPW 
{
    private boolean login;
    public CheckUNPW(String username,String password)
    {
        login=false;
            
        try 
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
            Statement stmt = (Statement) con.createStatement();
            String query = "SELECT username, password FROM users;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next())
            {
                String dbUsername = rs.getString("username");
                String dbPassword = rs.getString("password");

                if(dbUsername == username && dbPassword == password)
                {
                    System.out.println("OK");
                    login = true;
                    break;
                }
              //  System.out.println(username + password + " " + dbUsername + dbPassword);
            }
        } 
        catch (Exception e) 
        {
           // e.printStackTrace();
        } 
    }
    public boolean exists()
    {
        return login;
    }
}
