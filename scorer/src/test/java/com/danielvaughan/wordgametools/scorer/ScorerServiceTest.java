package com.danielvaughan.wordgametools.scorer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ScorerServiceTest {

    private ScorerService scorerService;

    @Before
    public void setUp() {
        scorerService = new ScorerService();
    }

    @Test
    public void given_empty_string_then_return_0() {
        assertThat(scorerService.score(""), is(equalTo(0)));
    }

    @Test
    public void given_cat_then_return_5() {
        assertThat(scorerService.score("cat"), is(equalTo(5)));
    }

    @Test
    public void given_pneumonoultramicroscopicsilicovolcanoconiosis_then_return_68() {
        assertThat(scorerService.score("pneumonoultramicroscopicsilicovolcanoconiosis"), is(equalTo(68)));
    }

    @Test
    public void given_PNEUMoNoUlTRaMIcrOSCopICSiLICoVOLCANOcONiOSIs_then_return_68() {
        assertThat(scorerService.score("PNEUMoNoUlTRaMIcrOSCopICSiLICoVOLCANOcONiOSIs"), is(equalTo(68)));
    }
}
