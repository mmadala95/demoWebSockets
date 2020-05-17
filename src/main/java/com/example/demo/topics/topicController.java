package com.example.demo.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class topicController {

    @Autowired
    private topicService topicService;

    @RequestMapping("/topics")
    public List<topics> getTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public topics getTopic(@PathVariable int id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody topics topic){
        topicService.addTopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public topics updateTopic(@RequestBody topics topic,@PathVariable int id){
        return topicService.updateTopic(topic,id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public String deleteTopic(@PathVariable int id){
        return topicService.deleteTopic(id);
    }
}
