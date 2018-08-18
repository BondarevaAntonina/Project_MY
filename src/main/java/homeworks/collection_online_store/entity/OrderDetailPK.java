package homeworks.collection_online_store.entity;

public class OrderDetailPK {

    private int orderId;
    private int productId;

    public OrderDetailPK() {
    }

    public OrderDetailPK(int orderId, int productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }


    @Override
    public String toString() {
        return "OrderId=" + orderId + ", productId=" + productId + "]";
    }
}
