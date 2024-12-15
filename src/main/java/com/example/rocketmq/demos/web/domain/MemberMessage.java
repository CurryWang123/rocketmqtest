package com.example.rocketmq.demos.web.domain;

import lombok.Data;

@Data
public class MemberMessage extends BaseMessage{
    private String content;
}
