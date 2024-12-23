package com.example.SpringAPI.service;

import com.example.SpringAPI.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1,"John","john@mail.com",23);
        User user2 = new User(2,"Johnbull","johnbull@mail.com",25);
        User user3 = new User(3,"Job","job@mail.com",32);
        User user4 = new User(4,"Joseph","joseph@mail.com",20);
        User user5 = new User(5,"Jonah","jonah@mail.com",30);

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id){
        Optional optional = Optional.empty();
        for (User user: userList){
            if (id== user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

}
