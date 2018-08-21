package homeworks.collection_online_store.entity;



public class CartProducts {

    private int quantityOrder;
    private double amountOrder;
    private Person person;
    private Product product;

    public CartProducts(int quantityOrder, double amountOrder, Person person, Product product) {
        this.quantityOrder = quantityOrder;
        this.amountOrder = amountOrder;
        this.person = person;
        this.product = product;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public double getAmountOrder() {
        return amountOrder;
    }

    public void setAmountOrder(double amountOrder) {
        this.amountOrder = amountOrder;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }



    @Override
    public String toString() {
        return "CartProducts=" + quantityOrder + "]";
    }
}

