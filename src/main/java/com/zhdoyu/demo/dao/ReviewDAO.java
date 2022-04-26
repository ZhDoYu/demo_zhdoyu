package com.zhdoyu.demo.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.zhdoyu.demo.pojo.Product;
import com.zhdoyu.demo.pojo.Review;
 
public interface ReviewDAO extends JpaRepository<Review,Integer>{
 
    List<Review> findByProductOrderByIdDesc(Product product);
    int countByProduct(Product product);
 
}