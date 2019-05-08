package com.example.demo.business;

import com.example.demo.aspects.TrackTime;
import com.example.demo.repository.Dao1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething(){
        String value = dao1.retrieveSomething();
        log.info("In Business - {}", value);
        return value;
    }

}
