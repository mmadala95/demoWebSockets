package com.example.demo.states;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class stateController {
    @Autowired
    private stateService stateService;

    @RequestMapping("/states")
    public List<states> getStates(){
        return stateService.getAllStatesData();
    }
}
