package com.zhdoyu.demo.dao;
  
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.zhdoyu.demo.pojo.Category;
 
public interface CategoryDAO extends JpaRepository<Category,Integer>{
 
}