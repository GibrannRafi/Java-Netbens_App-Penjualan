/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Penjualan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vivob
 */
public class koneksiPenjualan {
    private static Connection koneksi;
    
    public static Connection getKoneksiPenjualan(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost:3306/penjualan";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Berhasil");
            } catch (Exception e){
                System.out.println("Error");
            }
        }
        return koneksi;
    }
    
    public static void main (String args[]){
        getKoneksiPenjualan();
    }
}
