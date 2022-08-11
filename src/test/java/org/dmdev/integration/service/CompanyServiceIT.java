package org.dmdev.integration.service;

import lombok.RequiredArgsConstructor;
import org.dmdev.dto.UserDto;
import org.dmdev.integration.service.anatation.IT;
import org.dmdev.service.UserService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@IT
@RequiredArgsConstructor
public class CompanyServiceIT {
    private final UserService userService;

    @Test
    void findById() {
        var actualPresent = userService.findById(1);
        assertTrue(actualPresent.isPresent());
        var expectedResult = new UserDto(1);
        actualPresent.ifPresent(userDto -> assertEquals(expectedResult, userDto));


    }

    @Test
    void test1() {
        System.out.println("execute test 1");
    }

    @Test
    void test2() {
        System.out.println("execute test 2");
    }
}
