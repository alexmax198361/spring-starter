package org.dmdev.service;

import lombok.RequiredArgsConstructor;
import org.dmdev.dto.UserDto;
import org.dmdev.entity.User;
import org.dmdev.event.entity.AccessType;
import org.dmdev.event.entity.EntityEvent;
import org.dmdev.repository.CrudRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserService {

    private final ApplicationEventPublisher eventPublisher;
    private final CrudRepository<User, Integer> userRepository;

    public Optional<UserDto> findById(Integer id) {
        return userRepository.findById(id).map(user -> {
            eventPublisher.publishEvent(new EntityEvent(user, AccessType.VIEW));
            return new UserDto(id);
        });
    }
}
