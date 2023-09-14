package com.example.enumsearchexample.service;


public enum Answers {
    HI("HI", "Hello"),
    BYE("BYE", "Good bye"),
    HAY("HOW ARE YOU", "I'm ok!");

    private final String phrase;
    private final String answer;

    Answers(String phrase, String answer) {
        this.answer = answer;
        this.phrase = phrase;
    }

    public static String findAnswer(String request) {

        String requestUpperCase = request.toUpperCase();

        for (Answers answer : Answers.values()) {
            if (answer.phrase.equals(requestUpperCase)) {
                return answer.answer;
            }
        }

        return "Unknown request";
    }
}
