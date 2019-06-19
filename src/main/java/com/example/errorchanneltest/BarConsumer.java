package com.example.errorchanneltest;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;


@EnableBinding(StreamProcessor.class)
public class BarConsumer {


	@StreamListener("inputBar")
	public void inputFoo(Message<?> inputApi) {

		System.out.println("Read from channel inputBar" + inputApi);
		throw new RuntimeException("Boom");
	}

}
