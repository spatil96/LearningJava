package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductFilter {
    int id;
    String name;
    float price;
    public ProductFilter(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public static void main(String[] args) {
        List<ProductFilter> ProductFiltersList = new ArrayList<ProductFilter>();
        //Adding ProductFilters
        ProductFiltersList.add(new ProductFilter(1,"HP Laptop",25000f));
        ProductFiltersList.add(new ProductFilter(2,"Dell Laptop",30001f));
        ProductFiltersList.add(new ProductFilter(3,"Lenevo Laptop",28000f));
        ProductFiltersList.add(new ProductFilter(4,"Sony Laptop",28000f));
        ProductFiltersList.add(new ProductFilter(5,"Apple Laptop",90000f));
        List<Float> ProductFilterPriceList2 =ProductFiltersList.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(ProductFilterPriceList2);
        Stream.iterate(12, element->element+1)
                .filter(element->element%5==0 )
                .limit(5)
                .forEach(System.out::println);
        ProductFiltersList.stream()
                .filter(product -> product.price == 30001)
                .forEach(product -> System.out.println(product.name));
        ProductFiltersList.stream()
                .filter(product -> product.id == 1)
                .forEach(product -> System.out.println(product.name));
        Float totalPrice = ProductFiltersList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = ProductFiltersList.stream()
                .map(product->product.price)
                .reduce(1990000.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);
        double totalPrice3 = ProductFiltersList.stream()
                .collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3);
        // max() method to get max Product price
        ProductFilter productA = ProductFiltersList.stream().max((product1, product2)->product1.price > product2.price ? 2: -2).get();
        System.out.println("Max "+productA.price);
        // min() method to get min Product price
        ProductFilter productB = ProductFiltersList.stream().min((product1, product2)->product1.price > product2.price ? 1: -1).get();
        System.out.println("Min "+productB.price);
        long count = ProductFiltersList.stream()
                .filter(product->product.price<30000)
                .count();
        System.out.println("Count "+count);

        // Converting product List into Set
        Set<Float> productPriceList =
                ProductFiltersList.stream()
                        .filter(product->product.price < 30000)   // filter product on the base of price
                        .map(product->product.price)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceList);

        //Converting List to Map
        Map<Integer, String> hm = ProductFiltersList.stream().collect(Collectors.toMap(p->p.id, p->p.name));
        System.out.println("List to HashMap "+hm);

        List<Float> productPriceList1 =
                ProductFiltersList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(ProductFilter::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList1);
        System.out.println("----------------------------------");
        ProductFiltersList.stream()
                .filter(p ->p.price< 30000)   // filtering price
                .map(pm ->pm.price)          // fetching price
                .forEach(System.out::println);  // iterating price
    }
}

