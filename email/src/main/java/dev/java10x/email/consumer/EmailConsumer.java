package dev.java10x.email.consumer;

import dev.java10x.email.configuration.RabbitMq;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = RabbitMq.QUEUE_NAME)
    public void listenEmail(@Payload String emailMessage) {
        System.out.println("Email recebido: " + emailMessage);
    }
}
