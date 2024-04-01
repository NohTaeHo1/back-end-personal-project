package com.von.api.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.von.api.enums.Messenger;

import lombok.Getter;

public class MenuRepository {

    private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public Messenger returnMessenger() throws SQLException {
        String sql = "";
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        return (rs.next())?Messenger.SUCCESS:Messenger.FAIL;
    }

    public Menu returnOneMenu() throws SQLException {
        String sql = "";
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        Menu m = null;
        return m;
    }

    public List<?> returnALLMenus() throws SQLException {
        String sql = "";
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        List<Menu> ls = new ArrayList<>();
        if(rs.next()){
//            do{
//                ls.add(Menu.builder()
//                        .item(rs.getString("item"))
//                        .category(rs.getString("category"))
//                        .build());
//            }while(true){}
        }
        return ls;
    }
}
