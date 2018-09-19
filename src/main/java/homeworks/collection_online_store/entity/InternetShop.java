package homeworks.collection_online_store.entity;

import java.time.LocalDate;
import java.util.*;

public class InternetShop {

    private List <Product> products;

    private List<Order> orders;

    Map <String, Product> bucket = new HashMap <>();



    public InternetShop() {
        products = new LinkedList <>();

        products.addAll(Arrays.asList(
                new Product("32LG27MP68VQ-P", "Китай",
                        LocalDate.of(2015, 10, 14), 6689,
                        "Монитор 27 LG 27MP68VQ-P + 0,01% кредит на 5 мес", Category.COMPUTER, Subcategory.NOTEBOOK, 0),

                new Product("Lenovo Tab 7 Essential TB-7304i 3G", "Китай",
                        LocalDate.of(2017, 5, 17), 3399,
                        "Планшет Lenovo Tab 7 Essential TB-7304i 3G 2/16GB NBC Black", Category.MOBILE,
                        Subcategory.HEAD_PHONES, 0),

                new Product("Mouse Samsung", "Китай",
                        LocalDate.of(2017, 5, 17), 3399,
                        "Mouse Samsung", Category.COMPUTER,
                        Subcategory.MOUSE, 0),

                new Product("Nokia 10 Dual Sim Tempered Blue", "Китай",
                        LocalDate.of(2016, 4, 7), 10999,
                        "13 Мпикс (цветная + оптическая стабилизация изображения) + 13 Мпикс (монохромная) ",
                        Category.MOBILE, Subcategory.HEAD_PHONES, 0)));
    }



    public Product getProductByName( String name ) {
        for (Product product: products) {
             if(product.getName().equals(name)) return  product;
        }
        return null;
    }

    public void showProductWithRelatedProducs(String name) {

        Product prod = null;

        for (Product product : products) {
            if (Objects.equals(product.getName(), name)) {
                prod = product;
                break;
            }
        }

        System.out.println(prod);

        for (Product product : products) {
            if (prod.getCategory() == product.getCategory() && !prod.getName().equals(product.getName()) && prod.getSubcategory() != product.getSubcategory()) {
                System.out.println(product);
            }
        }
    }

    public void removeProductWithRelatedProducs(String nameProduct) {

        Product prod = null;

        List <Product> list = new ArrayList <>();

        for (Product product : products) {//9

            if (Objects.equals(product.getName(), nameProduct)) {
                prod = product;
                list.add(prod);
                break;
            }
        }

//        if() Objects.nonNull(prod)


        for (Product product : products) {//9

            if (product.getCategory() == prod.getCategory() && !product.getName().equals(prod.getName())) {
                list.add(product);
            }
        }

        products.removeAll(list);

        System.out.println();

       /* Iterator<Product> iterator = products.iterator();

        while (iterator.hasNext()) {

            Product product = iterator.next();

            if (Objects.equals(product.getName(), nameProduct)) {
                products.remove(product);
            }
        }*/

        System.out.println(products);
    }


    public void addProductsToBucket(Product product) {
        bucket.put(product.getName(), product);
        System.out.println(bucket);
    }

    public void addProductsToBucket(Product... products) {
        for ( Product pr : products )
            addProductsToBucket(pr);
        System.out.println(orders);
    }

    public void showSummaAmountProduct() {


    }
}
