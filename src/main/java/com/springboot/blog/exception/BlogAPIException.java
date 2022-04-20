package com.springboot.blog.exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public BlogAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = BlogAPIException.class.getSimpleName() + " - " + message;
    }

    public BlogAPIException(String message, HttpStatus status, String message1) {
        super(BlogAPIException.class.getSimpleName() + " - " + message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
