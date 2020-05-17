package com.example.demo.states;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class stateService {
    @Autowired
    private stateConnector stateConnector;

    public List<states> getAllStatesData(){
        List<states> states=new ArrayList<>();
        stateConnector.findAll().forEach(states::add);
        return states;
    }

}
