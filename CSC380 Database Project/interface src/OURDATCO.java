
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class OURDATCO {
    
    public OURDATCO () throws SQLException { 
       // class.forName()
       String url , uname, pass ;
       url = "";
       uname= "MOHAMMED_ADEL";
       pass= "Moh563277";
       
       Connection con = DriverManager.getConnection(url, uname, pass);
       
       
       
       
       
       
       
       
    }
    
}
