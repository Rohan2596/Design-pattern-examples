package com.designPattern;

public class User {

    private String name;
    private String language;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public User(String name, String language, String message) {
        this.name = name;
        this.language = language;
        this.message = message;
    }

    public User() {
    }

    public String translate(){
        return new Translator().translate(this.language,this.message);
    }


}
