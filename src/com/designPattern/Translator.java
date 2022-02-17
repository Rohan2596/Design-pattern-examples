package com.designPattern;

public class Translator implements ITranslator{


    @Override
    public String translate(String language,String message) {
        if(language
                .equalsIgnoreCase("SPANISH") && message.equalsIgnoreCase("Hola amigas")){
            return "Hello Friends";
        }
        if(language
                .equalsIgnoreCase("ENGLISH") && message.equalsIgnoreCase("fine and you")){
            return "multa";
        }

        return "Unable to translate The Text";
    }
}
