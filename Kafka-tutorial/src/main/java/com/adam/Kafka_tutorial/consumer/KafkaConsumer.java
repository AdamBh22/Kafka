package com.adam.Kafka_tutorial.consumer;

import com.adam.Kafka_tutorial.payload.AppUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "adam", groupId = "adamGroup")
    public void consumeMsg(String msg) {
        log.info(format("This is a message from adam Topic:: %s", msg));
    }

    @KafkaListener(topics = "adam", groupId = "adamGroup")
    public void consumeJsonMsg(AppUser user) {
        log.info(format("This is an AppUser from adam Topic:: %s", user.toString()));
    }
}
