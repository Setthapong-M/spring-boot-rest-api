package com.coursecodemobiles.mytodo;

public class TodoNotFoundException extends RuntimeException{

    public TodoNotFoundException() {
        
    }

    public TodoNotFoundException(long id) {
        super("Could not found todo " + id);
    }
}
