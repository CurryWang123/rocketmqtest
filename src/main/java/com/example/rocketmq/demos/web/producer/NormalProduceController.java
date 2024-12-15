package com.example.rocketmq.demos.web.producer;

import com.example.rocketmq.demos.web.domain.WorkInfo;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class NormalProduceController {
    @Autowired
    private RocketMQTemplate rocketmqTemplate;

    @GetMapping("/test")
    public String test() {
        Message<String> msg = MessageBuilder.withPayload("Hello,RocketMQ").build();
        rocketmqTemplate.send("topicA",msg);
        return "请求成功";
    }
    @GetMapping("sendWork")
    public String sendWork(){
        WorkInfo workInfo = new WorkInfo(UUID.randomUUID().toString(),"123456","任务内容");
        Message<WorkInfo> message = MessageBuilder.withPayload(workInfo).build();
        rocketmqTemplate.send("topicB",message);
        return "请求成功";
    }
}
