package com.von.api.user;
import java.util.List;

import com.von.api.article.Article;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;


@NoArgsConstructor (access = AccessLevel.PROTECTED)
@Getter
@ToString
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;

    @OneToMany(mappedBy = "user")
    private List<Article> article;

    
    private String username;
    private String passwordConfirm;    
    private String password;
    private String name;
    private String phone;
    private Long addressId;
    private String job;
    private double height;
    private double weight;

    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password, String passwordConfirm, String name, String phone, String job, double height, double weight) {
        this.username = username;
        this.passwordConfirm = passwordConfirm;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.job = job;
        this.height = height;
        this.weight = weight;
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}