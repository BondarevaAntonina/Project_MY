package homeworks.collection_online_store.entity;


public class Product {

    private String name;
    private double price;
    private String description;
    private String img;
    private byte[] imgSrc;
    private Category category;

    public Product() {
    }



    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String simg) {
        this.img = simg;
    }

    public byte[] getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(byte[] imgSrc) {
        this.imgSrc = imgSrc;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product[name=" + name + "]";
    }
}
