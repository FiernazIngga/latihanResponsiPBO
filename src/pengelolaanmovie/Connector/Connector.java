package pengelolaanmovie.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public Connection connection;
    
    String url = "jdbc:mysql://localhost/movie_db";
    String user = "root";
    String pass = "";
    
    public Connector() {
        try {
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
