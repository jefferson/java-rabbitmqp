package com.javaee.jefferson.rabbitmqp.services;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.javaee.jefferson.rabbitmqp.config.RabbitMQConfig;
import com.javaee.jefferson.rabbitmqp.domain.Message;

@Service
public class MessageServiceImpl  implements MessageService{

	private final RabbitTemplate rabbitTemplate;
	
	
	public MessageServiceImpl(RabbitTemplate rabbitTemplate) {
	
		// TODO Auto-generated constructor stub
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		this.rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_MESSAGES, message);
		
	}

}
