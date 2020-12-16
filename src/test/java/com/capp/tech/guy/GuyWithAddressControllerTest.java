package com.capp.tech.guy;

import com.capp.tech.controller.AbstractControllerTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;

public class GuyWithAddressControllerTest extends AbstractControllerTest {

    //@Test
    public void listGuysWithAddress() throws Exception {
        String uri = "/api/gwa";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andDo(document("sample")).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        GuyWithAddressDTO[] gwaList = super.mapFromJson(content, GuyWithAddressDTO[].class);
        assertTrue(gwaList.length > 0);
    }

    //@Test
    public void guysWithAddressById() {
    }
}