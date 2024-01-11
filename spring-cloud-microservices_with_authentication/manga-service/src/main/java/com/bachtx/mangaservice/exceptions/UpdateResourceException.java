package com.bachtx.mangaservice.exceptions;

public class UpdateResourceException extends RuntimeException {
    public UpdateResourceException() {
    }

    public UpdateResourceException(String message) {
        super(message);
    }

    public UpdateResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public UpdateResourceException(Throwable cause) {
        super(cause);
    }

    public UpdateResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
