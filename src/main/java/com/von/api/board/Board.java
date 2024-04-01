package com.von.api.board;


import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.von.api.article.Article;
import com.von.api.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;


@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"id"})
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "board")
    private List<Article> articles;

    private String boardName;
    private String boardType;    

    @Builder(builderMethodName = "builder")
    public Board(Long id, List<Article> articles, String boardName, String boardType) {
        this.id = id;
        this.boardName = boardName;
        this.boardType = boardType;
        this.articles = articles;
    }

}