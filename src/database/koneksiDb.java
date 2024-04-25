
package database;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksiDb {
        Connection connection;
        
        String url = "jdbc:mysql://localhost/kasir";
        String user = "root";
        String pass = "";
    public koneksiDb(){
        
        try {
            connection = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "koneksi gagal");
        }
    }
}
