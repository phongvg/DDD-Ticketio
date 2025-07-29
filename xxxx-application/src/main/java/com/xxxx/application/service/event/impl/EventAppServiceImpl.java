package com.xxxx.application.service.event.impl;

import com.xxxx.application.service.event.EventAppService;
import com.xxxx.domain.service.HiDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {
    //Call Domain Service

    @Autowired
    private HiDomainService hiDomainService;

    @Override
    public String sayHi(String name) {
        return hiDomainService.sayHi(name);
    }
}
