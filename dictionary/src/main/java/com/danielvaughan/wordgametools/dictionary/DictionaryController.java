package com.danielvaughan.wordgametools.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/lookup")
    public boolean lookup(@RequestParam("word") String word) {
        return dictionaryService.lookup(word);
    }
}
