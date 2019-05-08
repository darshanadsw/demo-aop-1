package com.example.demo.business;

import com.example.demo.repository.Dao2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Business2 {

    @Autowired
    private Dao2 dao2;

    public String calculateSomething(){
        //Business Logic
        return dao2.retrieveSomething();
    }
}
