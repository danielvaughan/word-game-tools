package com.danielvaughan.wordgametools.dictionary;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DictionaryServiceTest {

    private DictionaryService dictionaryService;

    @Before
    public void setUp() {
        dictionaryService = new DictionaryService();
    }

    @Test
    public void given_empty_string_then_return_false() {
        assertThat(dictionaryService.lookup(""), is(equalTo(false)));
    }

    @Test
    public void given_cat_then_return_true() {
        assertThat(dictionaryService.lookup("cat"), is(equalTo(true)));
    }

    @Test
    public void given_not_cat_then_return_false() {
        assertThat(dictionaryService.lookup("dog"), is(equalTo(false)));
    }
}
