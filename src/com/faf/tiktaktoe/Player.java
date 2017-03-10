package com.faf.tiktaktoe;

/**
 * Describes the characteristics of a player. Here I basically have the attributes for my  Player.
 */
class Player {
    private String name;
    private char mark;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
    }
}
