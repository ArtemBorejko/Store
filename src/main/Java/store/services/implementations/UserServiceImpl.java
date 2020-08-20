package store.services.implementations;

import store.entities.User;
import store.exceptions.ApiException;
import store.repositories.UserRepository;
import store.services.UserService;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Integer addUser(User user) {
        return userRepository.add(user);
    }

    @Override
    public User getUserByUsername(String username) {
        User user = userRepository.getUserByUsername(username);
        if(user == null){
            throw new ApiException("User not found" + username, 404);
        }
        return user;
    }

    @Override
    public User getUserById(int id) {
        User user = userRepository.getUserById(id);
        if(user == null){
            throw new ApiException("User not found" + id, 404 );
        }
        return user;
    }

    @Override
    public User updateUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteById(int id) {
        User user = userRepository.getUserById(id);
        if(user == null){
            throw new ApiException("User not found, there is nothing to delete" + id, 404);
        }
        userRepository.deleteById(id);
    }
}
