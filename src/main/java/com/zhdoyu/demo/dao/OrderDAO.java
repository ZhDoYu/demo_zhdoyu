package com.zhdoyu.demo.dao;
  
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.zhdoyu.demo.pojo.Order;
import com.zhdoyu.demo.pojo.User;
 
public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}