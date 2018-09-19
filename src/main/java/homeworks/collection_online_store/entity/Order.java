package homeworks.collection_online_store.entity;

import java.util.Map;

/**
 * Created by antoni on 14.09.2018.
 */
public class Order {

    private Map<String, Product> bucket;
    private int count;

    public Order(Map <String, Product> bucket, int count) {
        this.bucket = bucket;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Order{" + "bucket=" + bucket + ", count=" + count + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (count != order.count) return false;
        return bucket != null ? bucket.equals(order.bucket) : order.bucket == null;
    }

}
