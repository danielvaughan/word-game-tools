package com.danielvaughan.wordgametools.dictionary;

import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    public boolean lookup(String word) {
        return word.equals("cat") ? true : false;
    }

}
