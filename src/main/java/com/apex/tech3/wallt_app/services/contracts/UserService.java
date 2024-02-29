package com.apex.tech3.wallt_app.services.contracts;

import com.apex.tech3.wallt_app.models.User;
import com.apex.tech3.wallt_app.models.dtos.UserUpdateDto;

import java.util.List;

public interface UserService {
    User get(int id);
    User get(String username);
    List<User> getAll();
    User register(User user);
    User update(User user, User requester, UserUpdateDto dto, int id);

    boolean isAdmin(User user);

    User blockUser(int userId, User requester);

    User unblockUser(int userId, User requester);
}
