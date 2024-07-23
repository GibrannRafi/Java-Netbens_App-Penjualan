/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Admin;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
/**
 *
 * @author Vivob
 */
public class koneksiAdmin {
     private static Connection koneksi;
    
    public static Connection getKoneksiAdmin(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/databarang";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil Koneksi Database Admin");
            } catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main (String args[]){
        getKoneksiAdmin();
    }
}
