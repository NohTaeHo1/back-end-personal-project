package com.von.api.menu;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(exclude = {"id"})

public class Menu {
    private Long id;
    private String item;
    private String category;
    @Builder(builderMethodName = "builder")
    public Menu(String item, String category) {
        this.item = item;
        this.category = category;
    }
}
