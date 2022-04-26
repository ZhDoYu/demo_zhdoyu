package com.zhdoyu.demo.comparator;
 
import java.util.Comparator;
 
import com.zhdoyu.demo.pojo.Product;
 
public class ProductAllComparator implements Comparator<Product>{
 
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getReviewCount()*p2.getSaleCountFore()-p1.getReviewCount()*p1.getSaleCountFore();
    }
 
}