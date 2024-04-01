package com.von.api.auth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.von.api.user.User;

public class AuthController {
    public String join(@RequestBody Map<String,?> map) {

        AuthService authService;

        System.out.println("ID, " +
                "비밀번호, " +
                "비밀번호 확인, " +
                "이름, " +
                "주민번호 " +
                "전화번호, " +
                "주소, " +
                "직업을 입력해주세요");
        return null;
        // authService.join(User.builder()
        //         .username(scanner.next())
        //         .password(scanner.next())
        //         .name(scanner.next())
        //         //.address(scanner.next())
        //         .job(scanner.next())
        //         .build());
    }

    public String login(@RequestBody Map<String,?> map) {
        System.out.println("로그인할 ID 입력 : ");
        return null;
        // AuthService.login(User.builder()
        //         .username(scanner.next())
        //         .password(scanner.next())
        //         .build());
    }

    public Map<String, ?> findUserById(@RequestBody Map<String,?> map) {
        return map;
    }

    public Map<String, ?> updatePassword(@RequestBody Map<String,?> map) {
        return map;
    }

    public Map<String, ?> deleteUser(@RequestBody Map<String,?> map) {
        return map;
    }

    public Map<String, ?> getUserMap(@RequestBody Map<String,?> map) {
        return map;
    }



    public Map<String, ?> findUsersByName(@RequestBody Map<String,?> map) {
        return map;
    }

    public Map<String, ?> findUsersByJob(@RequestBody Map<String,?> map) {
        return map;
    }

    public Map<String, ?> countUsers(@RequestBody Map<String,?> map) {
        return map;
    }

}
