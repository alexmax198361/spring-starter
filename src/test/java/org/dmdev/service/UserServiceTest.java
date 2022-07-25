package org.dmdev.service;

import org.dmdev.dto.UserDto;
import org.dmdev.entity.User;
import org.dmdev.event.entity.EntityEvent;
import org.dmdev.repository.CrudRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

import java.util.Optional;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    private  ApplicationEventPublisher eventPublisher;
    @Mock
    private CrudRepository<User, Integer> userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    void findById() {

        Mockito.doReturn(Optional.of(new User(1))).when(userRepository).findById(1);
        var actualPresent = userService.findById(1);
        assertTrue(actualPresent.isPresent());

        var expectedResult = new UserDto(1);
        actualPresent.ifPresent(userDto -> assertEquals(expectedResult, userDto));
        Mockito.verify(eventPublisher).publishEvent(any(EntityEvent.class));
        Mockito.verifyNoMoreInteractions(eventPublisher);

    }
}