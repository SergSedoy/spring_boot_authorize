package com.example.spring_boot_authorize;

public enum Authorities {
    READ ("доступ на чтение"),
    WRITE ("доступ на запись"),
    DELETE ("доступ на удаление");

    private String title;

    Authorities(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
