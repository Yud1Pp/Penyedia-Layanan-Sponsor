package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db {
    public static void main(String[] args) {
        Statement st;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/penyedialayanansponsor", "root", "#Kipasangin1");
            System.out.println(con);
            
            st = con.createStatement();
            String query = "Select * from user";
            ResultSet ls = st.executeQuery(query);
            
            while (ls.next()) {                
                int id = ls.getInt("id");
                String name = ls.getString("username");
                String password = ls.getString("password");
                String email = ls.getString("email");
                
                System.out.println(ls);
                
                System.out.println("Id\t\t: "+ id +"\nUsername\t: " + name + "\nPassword\t: " + password + "\nEmail\t\t: " + email + "\n");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
