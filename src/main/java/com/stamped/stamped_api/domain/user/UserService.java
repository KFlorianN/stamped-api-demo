package com.stamped.stamped_api.domain.user;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.stamped.stamped_api.domain.user.dto.CreateUserRequest;
import com.stamped.stamped_api.domain.user.dto.UserResponse;
import com.stamped.stamped_api.exception.ResourceNotFoundException;

@Service
public class UserService {

    private Map<Long, UserResponse> users = new HashMap<>();

    public UserService(){
        users.put(1L, new UserResponse(1L, "paul.ti@gmail.com", "paulti", "FREE"));
        users.put(2L, new UserResponse(2L, "françois.sou@gmail.com", "fransou", "FREE"));
    }
    
    public UserResponse findById(Long id){
        return Optional.ofNullable(users.get(id))
            .orElseThrow(() -> new ResourceNotFoundException("USER_NOT_FOUND : "+ id));
    }

    public UserResponse create (CreateUserRequest request){
       Long newId = (long)(users.size()+1);
        UserResponse newUser = new UserResponse(newId, request.email(),request.username(), "FREE");
        users.put(newId, newUser);
        return newUser;

    }
}
