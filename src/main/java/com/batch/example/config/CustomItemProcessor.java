package com.batch.example.config;

import com.batch.example.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product item) throws Exception {
//        int discountPer = Integer.parseInt(item.getDiscount());
//        double originalPrice = Double.parseDouble(item.getPrice());
//        int discountPer = Integer.parseInt(item.getDiscount().trim());
//        double originalPrice = Double.parseDouble(item.getPrice().trim());
//        double discount = (discountPer/100) * originalPrice;
//        double finalPrice = originalPrice - discount;
//
//        item.setDiscountedPrice(String.valueOf(finalPrice));

        return item;
    }
}
