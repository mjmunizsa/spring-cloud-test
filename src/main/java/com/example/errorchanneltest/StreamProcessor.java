package com.example.errorchanneltest;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface StreamProcessor {

	@Input
	SubscribableChannel inputBar();

	@Input
	SubscribableChannel inputFoo();

}



