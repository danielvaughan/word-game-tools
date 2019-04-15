package com.danielvaughan.wordgametools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScorerController {

    @Autowired
    private ScorerService scorerService;

    @GetMapping("/score")
    public int score(@RequestParam("word") String word) {
        return scorerService.score(word);
    }

}
