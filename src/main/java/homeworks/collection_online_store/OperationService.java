package homeworks.collection_online_store;

import homeworks.collection_online_store.entity.Product;

import java.util.LinkedList;
import java.util.List;

public class OperationService {

    private List<Product> products;

    public OperationService() {
        products = new LinkedList<>();

    }


    public void addProduct(Product product) {

        products.add(product);
    }



}
