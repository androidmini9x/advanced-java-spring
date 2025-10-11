package com.codingnomads.corespring.examples.application_context.customeventlistener;

import org.springframework.context.ApplicationEvent;

public class UserSignInEvent extends ApplicationEvent {
    private String message;
    public UserSignInEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
