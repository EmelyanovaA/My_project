import java.sql.*;
import java.text.DateFormat;

import static javafx.scene.input.KeyCode.F;

public class RealisationDAO implements ImageDAO {

    public Image getImage(int id) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "12345";
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select *from project where id = "+id);
            int i = 1;
            while(res.next()){
                System.out.println("#"+i+"-"+res.getInt("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public boolean saveImage(Image image) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "12345";
        Connection conn = null;
        Image im = new Image();
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            String sql = "insert into project(id) values (?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, 955555);
            preparedStatement.executeUpdate();
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select *from project");
            int i = 1;
            while(res.next()) {
                System.out.println("#" + i + "-" + res.getInt("id"));
                i++;
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean deleteImage(int id) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "12345";
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            Statement stat = conn.createStatement();
            stat.executeUpdate("delete from project where id ="+id);
            ResultSet res = stat.executeQuery("select *from project");
            int i = 1;
            while(res.next()) {
                System.out.println("#" + i + "-" + res.getInt("id"));
                i++;
            }
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
        return false;
    }
}
