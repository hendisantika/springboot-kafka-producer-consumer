package com.hendisantika.kafkaproducerconsumer.controller;

import com.google.gson.Gson;
import com.hendisantika.kafkaproducerconsumer.model.MoreSimpleModel;
import com.hendisantika.kafkaproducerconsumer.model.SimpleModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Log4j2
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

    @PostMapping
    public void post(@RequestBody SimpleModel simpleModel) {
        kafkaTemplate.send("myTopic", jsonConverter.toJson(simpleModel));
    }

    @PostMapping("/v2")
    public void postV2(@RequestBody MoreSimpleModel moreSimpleModel) {
        kafkaTemplate.send("myTopic2", jsonConverter.toJson(moreSimpleModel));
    }

    @KafkaListener(topics = "myTopic")
    public void getFromKafka(String simpleModel) {
        log.info(simpleModel);
        SimpleModel simpleModel1 = jsonConverter.fromJson(simpleModel, SimpleModel.class);
        log.info(simpleModel1.toString());
    }

    @KafkaListener(topics = "myTopic2")
    public void getFromKafka2(String moreSimpleModel) {
        log.info(moreSimpleModel);
        MoreSimpleModel simpleModel1 = jsonConverter.fromJson(moreSimpleModel, MoreSimpleModel.class);
        log.info(simpleModel1.toString());
    }

}
