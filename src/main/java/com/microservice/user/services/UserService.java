package com.microservice.user.services;

import com.microservice.user.dtos.UserRequestDto;
import com.microservice.user.dtos.UserResponseDto;
import com.microservice.user.mapper.UserMapper;
import com.microservice.user.producers.UserProducer;
import com.microservice.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;
    final UserProducer userProducer;

    public UserService(UserRepository userRepository, UserProducer userProducer) {
        this.userRepository = userRepository;
        this.userProducer = userProducer;
    }
    @Transactional
    public UserResponseDto save(UserRequestDto userRequestDto) {
        var user = UserMapper.userEntity(userRequestDto);
        user = userRepository.save(user);
        userProducer.publishMessageEmail(user);
        return UserMapper.toResponse(user);
    }
}
