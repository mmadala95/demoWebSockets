package com.example.demo.topics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService {
    @Autowired
    private topicStoreConnector topicStoreConnector;

    //    private List<topics> topics= new ArrayList<>(Arrays.asList(
    //            new topics(1,"ms","MicroServices"),
    //            new topics(2,"js","JavaScript"),
    //            new topics(3,"ds","Docker Service")
    //    ));

    public List<topics> getAllTopics(){
    //        return topics;
        List<topics> topics=new ArrayList<>();
        topicStoreConnector.findAll().forEach(topics::add);
//        topicStoreConnector.findByTopicId(id).forEach(topics::add);
        return topics;
    }

    public topics getTopic(int id){
    //        return topics.stream().filter(item -> item.getId()==id).findFirst().get();
        return topicStoreConnector.findById(id).get();
    }

    public void addTopic(topics topic){
    //        topics.add(topic);
        topicStoreConnector.save(topic);

    }

    public topics updateTopic(topics topic,int id){
    //        int k=-1;
    //        for (int i=0;i<topics.size();i++){
    //            if (topics.get(i).getId()==id){
    //                topics.set(i,topic);
    //                k=i;
    //                break;
    //            }
    //        }
    //        return topics.get(k);

        topicStoreConnector.save(topic);
        return topicStoreConnector.findById(id).get();
    }

    public String deleteTopic(int id){
    //        topics.removeIf(item -> item.getId()==id);
        topicStoreConnector.deleteById(id);
        return "Success";
    }
}
