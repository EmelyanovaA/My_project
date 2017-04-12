
import java.sql.*;

public class Project {
    public static  void main(String args[]) {
//        Image image = new Image();
//        image.setId(12);
//        System.out.println(image.getId());
//        Image image1 =new Image(124,"g",null,null);
//        System.out.println(image.getId());
        RealisationDAO rdao = new RealisationDAO();
//        System.out.println(rdao.getImage(id));
//        System.out.println(rdao.deleteImage(id));
//        System.out.println(rdao.saveImage(image));
        rdao.print();
    }
}
