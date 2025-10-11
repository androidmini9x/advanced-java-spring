package com.codingnomads.corespring.examples.application_context.customeventlistener;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserSignInEventPublisher {
    private final ApplicationEventPublisher eventPublisher;

    public void publishMessage(String message) {
        UserSignInEvent userSignInEvent = new UserSignInEvent(this, message);
        System.out.println("================");
        eventPublisher.publishEvent(userSignInEvent);
        System.out.println("================");
    }
}
