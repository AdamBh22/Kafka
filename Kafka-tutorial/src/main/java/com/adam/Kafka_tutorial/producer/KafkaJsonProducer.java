package com.adam.Kafka_tutorial.producer;

import com.adam.Kafka_tutorial.payload.AppUser;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaJsonProducer {

    private final KafkaTemplate<String, AppUser> kafkaTemplate;

    public void sendMessage(AppUser appUser) {

        Message<AppUser> message = MessageBuilder
                .withPayload(appUser)
                .setHeader(KafkaHeaders.TOPIC, "adam")
                .build();

        kafkaTemplate.send(message);
    }
}