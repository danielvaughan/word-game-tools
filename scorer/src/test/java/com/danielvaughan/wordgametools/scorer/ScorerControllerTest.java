package com.danielvaughan.wordgametools.scorer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(ScorerController.class)
public class ScorerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ScorerService mockScorerService;

    @Test
    public void given_empty_string_then_return_0() throws Exception {
        given(mockScorerService.score("")).willReturn(0);

        mockMvc.perform(get("/score?word=")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is(0)));

    }

    @Test
    public void given_PNEUMoNoUlTRaMIcrOSCopICSiLICoVOLCANOcONiOSIs_then_return_68() throws Exception {
        given(mockScorerService.score("PNEUMoNoUlTRaMIcrOSCopICSiLICoVOLCANOcONiOSIs")).willReturn(68);

        mockMvc.perform(get("/score?word=PNEUMoNoUlTRaMIcrOSCopICSiLICoVOLCANOcONiOSIs")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", is(68)));

    }
}
