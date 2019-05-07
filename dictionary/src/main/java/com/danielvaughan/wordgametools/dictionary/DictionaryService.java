package com.danielvaughan.wordgametools.dictionary;

import org.springframework.stereotype.Service;

@Service
public class DictionaryService {

    public boolean lookup(String word) {
        boolean found = word.equals("dog") ? true : false;
        return found;
    }

}
