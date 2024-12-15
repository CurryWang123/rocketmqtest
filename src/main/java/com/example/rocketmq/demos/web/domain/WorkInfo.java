package com.example.rocketmq.demos.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WorkInfo {
    private String requestid;
    private String uid;
    private String content;
}
