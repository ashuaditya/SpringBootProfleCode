package com.app.ruuner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INotification;
@Component
public class ProfileRunner implements CommandLineRunner{

	@Autowired
	private INotification service;
	public void run(String... args) throws Exception 
	{
		service.notificate();
	}
}
