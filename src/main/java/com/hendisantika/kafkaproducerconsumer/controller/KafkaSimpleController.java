package com.hendisantika.kafkaproducerconsumer.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kafka-producer-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/05/21
 * Time: 06.59
 */
@RestController
@RequestMapping("/api/kafka")
public class KafkaSimpleController {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Gson jsonConverter;

    @Autowired
    public KafkaSimpleController(KafkaTemplate<String, String> kafkaTemplate, Gson jsonConverter) {
        this.kafkaTemplate = kafkaTemplate;
        this.jsonConverter = jsonConverter;
    }
}
