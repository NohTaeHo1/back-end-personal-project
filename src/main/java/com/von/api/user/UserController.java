package com.von.api.user;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.von.api.enums.Messenger;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "http://localhost:3100")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserRepository repo;
    private final UserServiceImpl service;

    @PostMapping("/api/login") 
    public Map<String,?> login(@RequestBody Map<?,?> paramMap){
        Map<String, Messenger> map = new HashMap<>();
        String username = (String) paramMap.get("userName");
        String password = (String) paramMap.get("password");
        User optUser = repo.findByUsername(username).orElse(null); // Entity, Optinal, List 세가지 타입만 가능 / 엔티티는 널값 때문에 최대한 쓰지말자!.orElse쓰거나

        if(optUser==null){
            map.put("message", Messenger.FAIL);
        }else if(optUser.getPassword().equals(password)){ // 외부에서의 입력값을 바깥쪽에 쓰는 습관 들이자
            map.put("message", Messenger.SUCCESS);
        }else if(!optUser.getPassword().equals(password)){
            map.put("message", Messenger.WRONG_PASSWORD);
        }
        return map;
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/api/all-users")
    public Map<?,?> findAll() throws SQLException {
        Map<String, Object> map = new HashMap<>();        
        List<User> list = new ArrayList<>();

        map.put("message", Messenger.SUCCESS);
        list = service.findAll();
        list.forEach(System.out::println);
        System.out.println("리스트 사이즈 : "+list.size());
        map.put("result",list);
        return map;
    }


    @PostMapping(path = "/api/users")
    public Map<?,?> join(@RequestBody Map<String,?> paramMap){

        User newUser = repo.save(User.builder()
        .username((String) paramMap.get("userName"))
        .password((String) paramMap.get("password"))
        .name((String) paramMap.get("name"))
        .phone((String) paramMap.get("phone"))
        .job((String) paramMap.get("job"))
        .height(Double.parseDouble((String) paramMap.get("height")))
        .weight(Double.parseDouble((String) paramMap.get("weight")))
        .build()   
        );
        System.out.println("DB에 저장된 User 정보: "+newUser);
        Map<String, Messenger> map = new HashMap<>(); 
        map.put("message", Messenger.SUCCESS);
        return map;
    }

    
    
    public Map<String, ?> findById(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> updatePassword(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;
    }
    
    public Map<String, ?> delete(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;
    }
    
    
    public Map<String, ?> findUsersByName(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    
    public Map<String, ?> findUsersByJob(Scanner scanner) {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    
    public Map<String, ?> count() {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    
    public Map<String, ?> findUsers() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> createUsers() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> createTable() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    }
    
    public Map<String, ?> deleteTable() throws SQLException {
        Map<String, String> map = new HashMap<>();
        return map;    


}

}
