package com.example.enumsearchexample;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controller.class)
public class ControllerIntTest {

    @Autowired
    MockMvc mockMvc;

    @ParameterizedTest
    @ValueSource(strings = { "hi", "bye", "how are you","blah-blah-blah" })
    public void getAnswerTest(String param) throws Exception {

        mockMvc.perform(get("http://localhost:8080/api/v1/enum-search/"+param))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(AnswersService.Answer(param).toString())));
    }
}
