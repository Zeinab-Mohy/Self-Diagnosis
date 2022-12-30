package com.project;

public class nonValiedChoise extends Exception{
    private int option;

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public nonValiedChoise(int option) {
        this.option = option;
    }
}
