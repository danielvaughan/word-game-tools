package com.danielvaughan.wordgametools;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ScorerServiceTest {

    private ScorerService scorerService;

    @Before
    public void setUp() throws Exception {
        scorerService = new ScorerService();
    }

    @Test
    public void given_empty_string_then_return_0() {
        Integer actual = scorerService.score("");
        assertThat(actual, is(equalTo(0)));
    }
}
