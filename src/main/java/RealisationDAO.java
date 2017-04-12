
import java.sql.*;

public class RealisationDAO implements ImageDAO {

    Driver driver = new Driver();
    Connection conn = driver.getConn();

    public Image getImage(int id){
        try {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select *from project where id = "+id);
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
        try {
            String sql = "insert into project(id) values (?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,12);
            preparedStatement.executeUpdate();
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select *from project");
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
        try {
            Statement stat = conn.createStatement();
            stat.executeUpdate("delete from project where id ="+id);
            ResultSet res = stat.executeQuery("select *from project");
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

    public void print() {
        try {
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select *from project");
            int i = 1;
            while(res.next()) {
                System.out.println("#" + i + "-" + res.getInt("id") + " " + res.getString("link"));
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
