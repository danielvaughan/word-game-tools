package com.danielvaughan.wordgametools;

import org.springframework.stereotype.Service;

@Service
public class ScorerService {

    public int score(String word) {
        String upperCaseWord = word.toUpperCase();
        char[] arrayWord = upperCaseWord.toCharArray();
        int score = 0;
        for (Character letter : arrayWord) {
            score += getValueLetter(letter);
        }
        return score;
    }

    private int getValueLetter(char letter) {
        switch (letter) {
            case 'G':
            case 'D':
                return 2;

            case 'B':
            case 'C':
            case 'M':
            case 'P':
                return 3;

            case 'F':
            case 'H':
            case 'V':
            case 'W':
            case 'Y':
                return 4;

            case 'K':
                return 5;

            case 'J':
            case 'X':
                return 8;

            case 'Q':
            case 'Z':
                return 10;

            default:
                return 1;
        }
    }
}
