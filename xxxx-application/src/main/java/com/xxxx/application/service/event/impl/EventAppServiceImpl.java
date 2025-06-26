package com.xxxx.application.service.event.impl;

import com.xxxx.application.service.event.EventAppService;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {

    @Override
    public String sayHi(String name) {
        return "Hello Application";
    }
}
