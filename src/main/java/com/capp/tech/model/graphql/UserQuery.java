package com.capp.tech.model.graphql;

import com.capp.tech.model.entity.User;
import com.capp.tech.model.entity.revision.UserRevision;
import com.capp.tech.services.UserService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class UserQuery implements GraphQLQueryResolver {

    private final UserService userService;

    public UserQuery(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsers() {
        return StreamSupport.stream(this.userService.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public User getUser(final Long id) {
        return this.userService.findById(id);
    }

    public List<UserRevision> getUserRevisions(final Long id) {
        return StreamSupport.stream(userService.findAllRevisionsById(id).spliterator(), false)
                .map(rev -> UserRevision.builder()
                        .revisionNumber(rev.getRequiredRevisionNumber())
                        .revisionDateTime(LocalDateTime.ofInstant(rev.getRequiredRevisionInstant(), ZoneOffset.UTC))
                        .user(rev.getEntity())
                        .build())
                .collect(Collectors.toList());
    }

}
