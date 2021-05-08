package com.hendisantika.kafkaproducerconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-kafka-producer-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/05/21
 * Time: 06.54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoreSimpleModel {
    private String title;
    private String description;
}
