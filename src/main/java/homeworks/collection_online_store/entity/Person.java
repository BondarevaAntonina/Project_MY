package homeworks.collection_online_store.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private City city;
    private Map<Product, Integer> bucket;

    public Person(String firstName, String lastName, String email, String address, City city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        bucket = new HashMap<>();
    }

    public void addProductToBucket(Product product, int count) {//2, monitor

        if (bucket.containsKey(product)) {//true
            Integer count1 = bucket.get(product);//5

            count = count1 + count;// 5 + 2

        }

        if (InternetShop.checkCountProduct(product) < count) {
            System.out.println("Отстань");
            return;
        }

        bucket.put(product, count);

        System.out.println(bucket);
    }

    public void showSumByOrder() {

        double sum = 0;


        for (Map.Entry<Product, Integer> entry : bucket.entrySet()) {
            sum += entry.getKey().getPrice() * entry.getValue();
        }

        System.out.println("Sum of the order = " + sum);
    }

}