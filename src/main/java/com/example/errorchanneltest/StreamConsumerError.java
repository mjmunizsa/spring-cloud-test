package com.example.errorchanneltest;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

@EnableBinding(StreamProcessor.class)
public class StreamConsumerError {


	@StreamListener("errorChannel")
	public void error(Message<?> message) {

		System.out.println("Handling ERROR: " + message);
	}

}
