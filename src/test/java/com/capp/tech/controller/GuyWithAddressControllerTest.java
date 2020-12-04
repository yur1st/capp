package com.capp.tech.controller;

import com.capp.tech.model.dto.GuyWithAddressDTO;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GuyWithAddressControllerTest extends AbstractTest {

    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void listGuysWithAddress() throws Exception {
        String uri = "/api/gwa";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        GuyWithAddressDTO[] gwaList = super.mapFromJson(content, GuyWithAddressDTO[].class);
        assertTrue(gwaList.length > 0);
    }

    @Test
    public void guysWithAddressById() {
    }
}