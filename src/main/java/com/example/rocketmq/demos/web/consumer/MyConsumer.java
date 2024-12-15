package com.example.rocketmq.demos.web.consumer;


import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

@Component
@RocketMQMessageListener(topic = "topicB", consumerGroup = "your_consumer_group_name")
public class MyConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        // 处理消息的逻辑
        System.out.println("Received message: " + message);
    }
}

