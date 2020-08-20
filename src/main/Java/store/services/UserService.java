package store.services;

import store.entities.User;

public interface UserService {
    Integer addUser(User user);

    User getUserByUsername(String username);

    User getUserById(int id);

    User updateUser(User user);

    void deleteById(int id);
}
