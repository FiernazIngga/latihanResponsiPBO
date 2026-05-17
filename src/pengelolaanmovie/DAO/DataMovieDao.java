package pengelolaanmovie.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import pengelolaanmovie.Connector.Connector;
import pengelolaanmovie.Model.ModelMovie;

public class DataMovieDao {
    Connection conn = new Connector().connection;
    
    public void insert(ModelMovie m) {
        try {
            String sql =  "INSERT INTO movie VALUES "
                    + "(null, '"
                    + m.getJudul() + "', "
                    + m.getAlur() + ", "
                    + m.getPenokohan() + ", "
                    + m.getAkting() + ", "
                    + m.getNilai() + ")";
            conn.createStatement().execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<ModelMovie> getAll() {
        List<ModelMovie> list = new ArrayList<>();
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM movie");
            while (rs.next()) {
                ModelMovie m = new ModelMovie();
                m.setId(rs.getInt("id"));
                m.setJudul(rs.getString("judul"));
                m.setAlur(rs.getDouble("alur"));
                m.setPenokohan(rs.getDouble("penokohan"));
                m.setAkting(rs.getDouble("akting"));
                m.setNilai(rs.getDouble("nilai"));
                
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return list;
    }
    
    public void update(ModelMovie m) {
        try {
            String sql = "UPDATE movie SET "
                    + "judul='" + m.getJudul() + "', "
                    + "alur=" + m.getAlur() + ", "
                    + "penokohan=" + m.getPenokohan() + ", "
                    + "akting=" + m.getAkting() + ", "
                    + "nilai=" + m.getNilai() 
                    + " WHERE id=" + m.getId();
            conn.createStatement().execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(int id) {
        try {
            conn.createStatement().execute("DELETE FROM movie WHERE id=" + id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteAll() {
        try {
            conn.createStatement().execute("DELETE FROM movie");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
