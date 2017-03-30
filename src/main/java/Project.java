
import java.sql.*;

public class Project {
    public static  void main(String args[]) {
        int id =555555;
        Image image = new Image();
        RealisationDAO rdao = new RealisationDAO();
        System.out.println(rdao.getImage(id));
        System.out.println(rdao.deleteImage(id));
        //System.out.println(rdao.saveImage(image));
    }
}
