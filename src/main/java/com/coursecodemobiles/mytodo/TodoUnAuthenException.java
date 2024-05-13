package com.coursecodemobiles.mytodo;

public class TodoUnAuthenException extends RuntimeException {

    public TodoUnAuthenException() {
        super("Token Invalid");
    }
}
