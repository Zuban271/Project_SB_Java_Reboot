package com.myproject.cybersec;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest
public class CyberControllerTest {
  /*  @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private TM_identifireRepository repository;
    @Test
    public void givenTM_identifire_whenAdd_thenStatus201andTM_identifireReturned() throws Exception {
       TM_identifire tm_identifire = new TM_identifire();
       LocalDate localdate = LocalDate.parse("2021-05-05");
       tm_identifire.setDate(Date.from(localdate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
       tm_identifire.setGiven(true);
       tm_identifire.setNumber_TM("E2A3B50000000");
       tm_identifire.setToWhom("ВСП201");
       tm_identifire.setResponsible("Иванов И.И.");
       tm_identifire.setZno("ЗНО0000222");
        Mockito.when(repository.save(Mockito.any())).thenReturn(tm_identifire);
        mockMvc.perform(post("/add").content(objectMapper.writeValueAsString(tm_identifire)).contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated()).andExpect(content().json(objectMapper.writeValueAsString(tm_identifire)));
    }

   */
}
