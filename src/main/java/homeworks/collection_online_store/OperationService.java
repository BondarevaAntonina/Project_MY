package homeworks.collection_online_store;

import homeworks.collection_online_store.entity.Product;
import homeworks.collection_online_store.entity.RelatedProduct;

import java.util.LinkedList;


public class OperationService {

    private LinkedList <Product> products;

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


//    private void fillProduct()  {
//
//        products.addAll(LinkedList<Product>(
//                new Product("Монитор 27 LG 27MP68VQ-P ", "Китай ",
//                        LocalDate.of(2015,10,14), 6689,
//                        "Монитор 27 LG 27MP68VQ-P + 0,01% кредит на 5 мес",  Category.COMPUTER, Subcategory.PHONE),
//                new Product("Планшет Lenovo Tab 7 Essential TB-7304i 3G ", "Китай ",
//                        LocalDate.of(2017,5,17), 3399,
//                        "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black",  Category.MOBILE,
//                        Subcategory.HEAD_PHONES)));
//
//
//    }


    public void addRelatedProductToProduct(RelatedProduct relatedProduct) {
        products.add(relatedProduct);

        for (Product p : products) {

            System.out.println(p.getName() + " " + p.getBreeder() + " " + p.getDateBreeder() + " " + p.getPrice() +
                    " " + p.getCategory());
        }

    }
//
//    public void removeRelatedProduct() {
//
//    }


}
