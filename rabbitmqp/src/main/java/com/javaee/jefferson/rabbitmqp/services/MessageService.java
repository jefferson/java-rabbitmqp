package com.javaee.jefferson.rabbitmqp.services;

import com.javaee.jefferson.rabbitmqp.domain.Message;

public interface MessageService {

	void sendMessage(Message message);
}
