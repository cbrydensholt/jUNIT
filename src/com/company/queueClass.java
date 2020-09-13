package com.company;

import java.util.*;

public class queueClass  {

    RubberDuck duck = new RubberDuck();

    Queue<RubberDuck> rubberduckLine = new LinkedList<>();

    public void createQueue() {


        for(int i = 0; i<10; i++){
        RubberDuck duck = new RubberDuck(1);
        duck.setDuckNumber(i);
            rubberduckLine.add(duck);

        }


    }
    public void addToQueue(RubberDuck rubberDuck){

    rubberduckLine.offer(rubberDuck);
        System.out.println(rubberDuck.getDuckNumber());


    }
    


}
