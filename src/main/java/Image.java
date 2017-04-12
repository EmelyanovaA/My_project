import java.util.Date;

public class Image {
    private int id;
    private String link;
    private Date createDate, modifyDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Image(int id, String link, Date createDate, Date modifyDate){
        this.id = id;
        this.link = link;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

    public Image(){}
}
