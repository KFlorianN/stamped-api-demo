package com.stamped.stamped_api.domain.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.stamped.stamped_api.domain.user.dto.UserResponse;

@Service
public class UserService {

    private Map<Long, UserResponse> users = new HashMap<>();

    public UserService(){
        users.put(1L, new UserResponse(1L, "paul.ti@gmail.com", "paulti", "FREE"));
        users.put(2L, new UserResponse(2L, "françois.sou@gmail.com", "fransou", "FREE"));
    }
    
    public UserResponse findById(Long id){
        return users.get(id);
    }
}
