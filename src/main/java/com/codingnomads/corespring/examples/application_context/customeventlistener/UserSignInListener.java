package com.codingnomads.corespring.examples.application_context.customeventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserSignInListener implements ApplicationListener<UserSignInEvent> {
    @Override
    public void onApplicationEvent(UserSignInEvent event) {
        System.out.println(event.getMessage());
    }
}
