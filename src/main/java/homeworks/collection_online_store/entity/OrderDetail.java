package homeworks.collection_online_store.entity;

import homeworks.collection_online_store.entity.CustomerOrder;
import homeworks.collection_online_store.entity.OrderDetailPK;
import homeworks.collection_online_store.entity.Product;

public class OrderDetail {

    protected OrderDetailPK orderDetailPK;
    private int qty;
    private Product product;
    private CustomerOrder customerOrder;

    public OrderDetail() {
    }

    public OrderDetail(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public OrderDetail(OrderDetailPK orderDetailPK, int qty) {
        this.orderDetailPK = orderDetailPK;
        this.qty = qty;
    }

    public OrderDetail(int orderId, int productId) {
        this.orderDetailPK = new OrderDetailPK(orderId, productId);
    }

    public OrderDetailPK getOrderDetailPK() {
        return orderDetailPK;
    }

    public void setOrderDetailPK(OrderDetailPK orderDetailPK) {
        this.orderDetailPK = orderDetailPK;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
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
        return "OrderDetailPK=" + orderDetailPK + "]";
    }
}
