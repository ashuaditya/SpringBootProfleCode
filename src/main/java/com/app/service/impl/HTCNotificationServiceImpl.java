package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotification;

@Component
@Profile("htc")
public class HTCNotificationServiceImpl implements INotification {

	
	public void notificate() {
		System.out.println("I am from HTC Notification");
	}

}
