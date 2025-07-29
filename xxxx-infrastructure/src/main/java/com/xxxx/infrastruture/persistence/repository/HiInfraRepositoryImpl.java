package com.xxxx.infrastruture.persistence.repository;

import com.xxxx.domain.repository.HiDomainRepository;
import org.springframework.stereotype.Service;

@Service
public class HiInfraRepositoryImpl implements HiDomainRepository {

    @Override
    public String sayHi(String name) {
        return "Hi Infrastructure";
    }
}
