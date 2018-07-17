package com.javaee.jefferson.rabbitmqp.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.javaee.jefferson.rabbitmqp.config.RabbitMQConfig;
import com.javaee.jefferson.rabbitmqp.domain.Message;

@Component
public class MessageListener {

	static final Logger logger = LoggerFactory.getLogger(MessageListener.class);
	
	@RabbitListener(queues = RabbitMQConfig.QUEUE_MESSAGES)
	public void processMessage(Message message)
	{		
		logger.info("Message Received");
		logger.info("Subject:" + message.getSubject());
		logger.info("Body:"+ message.getBody());	
	}
	
}