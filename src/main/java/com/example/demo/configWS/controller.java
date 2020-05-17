package com.example.demo.configWS;

import com.example.demo.states.states;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class controller {

    @MessageMapping("/states")
    @SendTo("/topic/states")
    public states getData(states state){
        System.out.println("Testing "+ state);
        return state;
    }
}
