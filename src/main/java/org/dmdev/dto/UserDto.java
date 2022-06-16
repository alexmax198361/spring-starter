package org.dmdev.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
public class UserDto {

    private final int id;

}
