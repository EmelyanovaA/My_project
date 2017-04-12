
public interface ImageDAO {
    public Image getImage(int id);
    public boolean saveImage(Image image);
    public boolean deleteImage(int id);
    void print();
}
