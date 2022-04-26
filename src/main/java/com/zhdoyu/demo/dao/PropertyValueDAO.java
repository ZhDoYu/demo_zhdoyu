package com.zhdoyu.demo.dao;
  
import java.util.List;

import com.zhdoyu.demo.pojo.Product;
import com.zhdoyu.demo.pojo.Property;
import com.zhdoyu.demo.pojo.PropertyValue;
import org.springframework.data.jpa.repository.JpaRepository;

 
public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{
 
    List<PropertyValue> findByProductOrderByIdDesc(Product product);
    PropertyValue getByPropertyAndProduct(Property property, Product product);
 
}