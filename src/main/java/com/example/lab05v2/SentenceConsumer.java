package com.example.lab05v2;

import org.apache.catalina.startup.SetNextNamingRule;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class SentenceConsumer {
    protected Sentence sentences;
    public SentenceConsumer(){
        sentences = new Sentence();
    }
    @RabbitListener(queues = "BadWordQueue")
    public void addBadSentence(String s){
        sentences.badSentence.add(s);
        System.out.println("In addBadSentence Method :" + sentences.badSentence);
    }

    @RabbitListener(queues = "GoodWordQueue")
    public void addGoodSentence(String s){
        sentences.goodSentence.add(s);
        System.out.println("In addGoodSentence Method :" + sentences.goodSentence);
    }

    @RabbitListener(queues = "GetQueue")
    public Sentence getSentence(){
        return sentences;
    }

}
