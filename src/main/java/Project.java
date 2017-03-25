
import java.sql.*;

public class Project {
    public static  void main(String args[]){
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String pass = "12345";
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            Statement stat = conn.createStatement();
            ResultSet res = stat.executeQuery("select * from project");
            int i = 1;
            while(res.next()){
                System.out.println("#"+i+"-"+res.getInt("id")+" "+res.getString(2));
                i++;
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
    }
}
