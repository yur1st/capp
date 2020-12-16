package com.capp.tech.controller;

import com.capp.tech.model.dto.AttributeLimitRangeDto;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;

public class AttributeLimitRangeControllerTest extends AbstractControllerTest {

    @Test
    public void listAttributeLimitRange() throws Exception {
        String uri = "/api/attribute/limitrange/list";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andDo(document("sample")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        AttributeLimitRangeDto[] list = super.mapFromJson(content, AttributeLimitRangeDto[].class);
        assertTrue(list.length > 0);
    }
}
