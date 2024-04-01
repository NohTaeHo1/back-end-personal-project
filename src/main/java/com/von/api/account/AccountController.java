package com.von.api.account;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.von.api.enums.Messenger;

public class AccountController {
    
    public Map<String, ?> save(@RequestBody Map<String,?> map) {
        return map;

    }

    public Map<String, ?> deposit(@RequestBody Map<String,?> map) {
        return map;

  

    }

    public Map<String, ?> withdraw(@RequestBody Map<String,?> map) {
        return map;

  
    }

    public Map<String, ?> getBalance(@RequestBody Map<String,?> map) {
        return map;

    }

    public Map<String, ?> deleteAccount(@RequestBody Map<String,?> map) {
        return map;
    }
}