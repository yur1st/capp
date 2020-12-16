package com.capp.tech.repository.datajpa;

import com.capp.tech.model.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserRepositoryTest extends AbstractRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    public UserRepositoryTest() {
    }

    @Test
    public void whenFindAll_thenReturnListOfUsers() {

        User user1 = new User();
        user1.setFirstName("Yuri");
        user1.setLastName("Okhvat");
        user1.setEmail("yu@o.ru");
        entityManager.persistAndFlush(user1);

        User user2 = new User();
        user2.setFirstName("Imyarek");
        user2.setLastName("Nektoev");
        user2.setEmail("i@no.ru");
        entityManager.persistAndFlush(user2);

        List<User> found = userRepository.findAll();

        assertThat(found.size() == 2);
    }

    @Test
    public void whenFindById_thenReturnUser() {

        User user1 = new User();
        user1.setFirstName("Yuri");
        user1.setLastName("Okhvat");
        user1.setEmail("yu@o.ru");
        User created = entityManager.persistAndFlush(user1);

        User found = userRepository.findById(created.getId()).orElseThrow();

        assertThat(found.equals(user1));
    }

}