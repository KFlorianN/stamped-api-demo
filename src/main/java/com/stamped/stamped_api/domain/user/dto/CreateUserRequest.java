package com.stamped.stamped_api.domain.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateUserRequest(
    @NotBlank @Email String email, 
    @NotBlank @Size(min=8) String password,
    @NotBlank @Size(min=3, max=30) String username
){}