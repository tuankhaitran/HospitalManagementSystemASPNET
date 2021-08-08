/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author trank
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hospitalmanagementsystem","root","43R6HVHp9qpn");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
}
}
