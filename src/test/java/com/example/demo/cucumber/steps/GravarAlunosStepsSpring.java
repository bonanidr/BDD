package com.example.demo.cucumber.steps;

import com.example.demo.repository.AlunoService;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@CucumberContextConfiguration
@AutoConfigureMockMvc
@SpringBootTest()
public class GravarAlunosStepsSpring {
    @Autowired
    AlunoService alunoService;

    @Autowired
    private MockMvc mockMvc;

    void teste() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/HelloWord"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello Word")));
    }

}
