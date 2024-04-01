package com.von.api.menu;

import java.sql.SQLException;
import java.util.List;

import com.von.api.enums.Messenger;

public interface MenuService {
        Messenger returnMessenger() throws SQLException;

    Menu returnOneMenu() throws SQLException;

    List<?> returnALLMenus() throws SQLException;
}
