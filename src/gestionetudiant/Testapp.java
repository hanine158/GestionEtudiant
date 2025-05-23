/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionetudiant;

/**
 *
 * @author Hanine
 */
import java.sql.*;
import connexion.DBConnexion;
public class Testapp {
     public static void main(String[] args) {
        Connection cn = DBConnexion.getConnection();
        if (cn != null) {
            try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM Table1");
                while (rs.next()) {
                    System.out.println(rs.getInt("num") + " " + rs.getString("nom") + " " + rs.getString("prenom"));
                }
                st.close();
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
    
}
