package com.company;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class queueClassTest {

    Queue<RubberDuck> rubberduckLine = new LinkedList<>();

    @Test
    void createQueue() {

        RubberDuck duck = new RubberDuck();

        for(int i = 0; i < 10; i++){
            RubberDuck ducks = new RubberDuck(1);
            duck.setDuckNumber(i);
            rubberduckLine.add(ducks);
            RubberDuck duck3 = new RubberDuck(20);
            rubberduckLine.offer(duck3);
        }
        assertEquals(10, rubberduckLine.size() );


    }

    @Test
    void peekIt(){

        assertEquals(1, rubberduckLine.peek());

    }

    @Test
    void addToQueue() {



    }
}