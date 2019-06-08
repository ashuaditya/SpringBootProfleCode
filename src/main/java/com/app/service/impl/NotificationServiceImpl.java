package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotification;

@Component
@Profile("default")
public class NotificationServiceImpl implements INotification {

	
	public void notificate() {
		System.out.println("I am from Default Notification");
	}

}
