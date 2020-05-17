package com.example.demo.configWS;

import com.example.demo.states.stateService;
import com.example.demo.states.states;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Iterator;
import java.util.List;

@Configuration
@EnableScheduling
public class schedulerConfig {

    @Autowired
    SimpMessagingTemplate simpMessagingTemplate;
    @Autowired
    private com.example.demo.states.stateService stateService;

    @Scheduled(fixedDelay = 5000)
//    public void sendAdhocMessages() {
//        simpMessagingTemplate.convertAndSend("/topic/states", new states("test","{'l1':'123'.'l2':'123'}"));
//    }
    public void sendMessages(){
        List<states> list=stateService.getAllStatesData();
//        Iterator<states> iterator=list.iterator();

        for (int i=0;i<5;i++){
            if(i!=1 && i!=4){
                simpMessagingTemplate.convertAndSend("/topic/states",list.get(i));
            }
        }

    }

}
