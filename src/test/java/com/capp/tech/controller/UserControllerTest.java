package com.capp.tech.controller;

import com.capp.tech.mapping.UserMapper;
import com.capp.tech.model.dto.UserDto;
import com.capp.tech.model.entity.Role;
import com.capp.tech.model.entity.User;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;

class UserControllerTest extends AbstractControllerTest {

    @Autowired
    UserMapper userMapper;

    @SneakyThrows
    @Test
    void getAttributeById() {
        String uri = "/api/user/13";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andDo(document("sample")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        UserDto foundDto = super.mapFromJson(content, UserDto.class);

        Role admin = new Role();
        admin.setName("Администратор");
        admin.setValue("ADMIN");

        Role engineer = new Role();
        engineer.setName("Технолог");
        engineer.setValue("ENGINEER");

        User user1 = new User();
        user1.setFirstName("Yuri");
        user1.setLastName("Okhvat");
        user1.setEmail("yu@o.ru");
        user1.getRoles().add(engineer);
        user1.getRoles().add(admin);

        UserDto userDto = userMapper.toDto(user1);
        assertEquals(foundDto, userDto);
    }

    @Test
    void listAll() {
    }

    @Test
    void deletebyId() {
    }

    @Test
    void getLastRevisionById() {
    }

    @Test
    void getAllRevisionById() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }
}