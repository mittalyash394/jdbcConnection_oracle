
package oracle_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Oracle_connection {

   
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:system", "system", "yash420");
            System.out.println("Connected : )");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            while(rs.next()){
                System.out.println(rs.getString(1) + " " + rs.getInt(2));
            }
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
