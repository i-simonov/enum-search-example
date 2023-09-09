package com.example.enumsearchexample;

public enum AnswersService {
    HI("HI","Hello"),
    BYE("BYE","Good bye"),
    HAY("HOW ARE YOU","I'm ok!");

    private String phrase, answer;

    AnswersService(String phrase, String answer){
        this.answer = answer;
        this.phrase = phrase;
    }

    static String Answer(String request){

        for (AnswersService answer: AnswersService.values()) {
            if (answer.phrase.equals(request.toUpperCase())) return answer.answer;
        }

        return "Unknown request";
    }
}
