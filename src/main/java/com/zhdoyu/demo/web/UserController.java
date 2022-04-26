package com.zhdoyu.demo.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
import com.zhdoyu.demo.pojo.User;
import com.zhdoyu.demo.service.UserService;
import com.zhdoyu.demo.util.Page4Navigator;
  
@RestController
public class UserController {
    @Autowired UserService userService;
 
    @GetMapping("/users")
    public Page4Navigator<User> list(@RequestParam(value = "start", defaultValue = "0") int start,@RequestParam(value = "size", defaultValue = "10") int size) throws Exception {
        start = start<0?0:start;
        Page4Navigator<User> page = userService.list(start,size,5);
        return page;
    }
         
}