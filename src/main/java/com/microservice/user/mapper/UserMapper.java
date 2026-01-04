package com.microservice.user.mapper;

import com.microservice.user.dtos.UserRequestDto;
import com.microservice.user.dtos.UserResponseDto;
import com.microservice.user.models.User;

public class UserMapper {

    public static User userEntity(UserRequestDto userRequestDto) {
        return User.builder()
                .name(userRequestDto.name())
                .email(userRequestDto.email())
                .build();
    }
    public static UserResponseDto toResponse(User user) {
        return new UserResponseDto(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
