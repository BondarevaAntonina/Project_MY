package homeworks.collection_online_store;

import homeworks.collection_online_store.entity.Product;
import homeworks.collection_online_store.entity.RelatedProduct;

import java.util.LinkedList;
import java.util.List;


public class OperationService {

    private List <Product> products;

    public OperationService() {
        products = new LinkedList <>();


        for (Product product : products) {
            System.out.println(product);
        }
    }


    public void addProduct(Product product) {

        products.add(product);

        for (Product p : products) {

            System.out.println(p.getName() + " " + p.getBreeder() + " " + p.getDateBreeder() + " " + p.getPrice() +
                    " " + p.getCategory());
        }

    }

    public void addRelatedProductToProduct(RelatedProduct relatedProduct) {
        products.add(relatedProduct);

        for (Product p : products) {

            System.out.println(p.getName() + " " + p.getBreeder() + " " + p.getDateBreeder() + " " + p.getPrice() +
                    " " + p.getCategory());
        }

    }


}
