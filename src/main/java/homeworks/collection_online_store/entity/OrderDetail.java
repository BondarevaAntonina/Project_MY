package homeworks.collection_online_store.entity;

public class OrderDetail {


    private Product product;
    private CustomerOrder customerOrder;

    public OrderDetail() {
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CustomerOrder getCustomerOrder() {
        return customerOrder;
    }

    public void setCustomerOrder(CustomerOrder customerOrder) {
        this.customerOrder = customerOrder;
    }

    @Override
    public String toString() {
        return "OrderDetail=" + customerOrder + "]";
    }
}
