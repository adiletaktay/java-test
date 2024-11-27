package org.example;

public enum LoggingLevel {

    PENDING(1, ""), PROCESSING(2, ""), PROCESSED(3, ""), ERROR(4, "some text");

    private int i;

    private LoggingLevel(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public int code() {
        return i;
    }

}