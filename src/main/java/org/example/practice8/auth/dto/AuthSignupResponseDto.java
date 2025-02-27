package org.example.practice8.auth.dto;

import lombok.Getter;

@Getter
public class AuthSignupResponseDto {

    private final Long id;
    private final String email;

    public AuthSignupResponseDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }
}
