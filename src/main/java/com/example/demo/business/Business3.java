package com.example.demo.business;

import org.springframework.stereotype.Service;

@Service
public class Business3 {

    public void doThrowing(){
        throw new UnsupportedOperationException("This is a test");
    }

}
