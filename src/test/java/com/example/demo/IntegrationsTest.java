package com.example.demo;

import com.example.demo.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationsTest {

    @Autowired
    MockMvc mvc;

    @Autowired
    ObjectMapper mapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testPostUser() throws Exception {
        // See is "new book" exist - it should not
        mvc.perform(
                MockMvcRequestBuilders.get("/registrer")
        )
                .andExpect(status().is2xxSuccessful());
        //.andExpect(MockMvcResultMatchers.content().string(not(containsString("New User"))));
        // Create "new book"
        mvc.perform(
                MockMvcRequestBuilders.post("/registrer")
                        .content(mapper.writeValueAsString(new User("Robin", "Ladyboy", "Katoi", "soi6@pattaya.com")))
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
        )
                .andExpect(status().is2xxSuccessful())
                .andExpect(MockMvcResultMatchers.content().string(containsString("Robin")));
    }
}

//    @Test
//    public void getUsers() throws Exception {
//        mvc.perform(
//                MockMvcRequestBuilders.get("/book")
//        )
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(MockMvcResultMatchers.content().string(containsString("Spring Boot 2 Recipes")))
//                .andExpect(MockMvcResultMatchers.content().string(containsString("Spring Boot in Action")));
//    }
//
//    @Test
//    public void getBookById() throws Exception {
//        mvc.perform(
//                MockMvcRequestBuilders.get("/book/1")
//        )
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(MockMvcResultMatchers.content().string(containsString("Spring Boot in Action")));
//    }


//    @Test
//    public void testPutBook() throws Exception {
//        // See is "new book" exist - it should not
//        mvc.perform(
//                MockMvcRequestBuilders.get("/book/8")
//        )
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(MockMvcResultMatchers.content().string((containsString("Cloud-Native Applications in Java"))));
//        // Create "new book"
//        mvc.perform(
//                MockMvcRequestBuilders.put("/book/8")
//                        .content(mapper.writeValueAsString(new Book((long) 8, "Book 8", "New Author", 10)))
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//        )
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(MockMvcResultMatchers.content().string(containsString("Book 8")));
//        // See if "new book" exist
//        mvc.perform(
//                MockMvcRequestBuilders.get("/book/8")
//        )
//                .andExpect(status().is2xxSuccessful())
//                .andExpect(MockMvcResultMatchers.content().string(not(containsString("Cloud-Native Applications in Java"))));
//    }
//}