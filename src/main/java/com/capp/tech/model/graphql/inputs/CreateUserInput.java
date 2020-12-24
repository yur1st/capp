package com.capp.tech.model.graphql.inputs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CreateUserInput {
    private final String email;
    private final String password;
}
