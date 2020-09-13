package com.company;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class customQueueClass extends AbstractQueue {

    //en queue class er som en kø, tilføjer til bagerst i køen, fjerner fra forrest i køen
    // vi vil gerne lave peek, offer og size

    private LinkedList<RubberDuck> rubberDucks;

    public customQueueClass(){
        this.rubberDucks = new LinkedList<>();
    }

    @Override
    public Iterator<RubberDuck> iterator() {
        return rubberDucks.iterator();
    }

    public boolean offer(RubberDuck duckies) { //sætter en and ind på sidste pladsen
        if(duckies == null) return false;
        rubberDucks.add(duckies);
        return true;
    }

    @Override
    public RubberDuck peek() { //henter man rør ikke den første and
        return rubberDucks.getFirst();
    }

    @Override
    public int size() { //størrelsen på queue
        return rubberDucks.size();
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public RubberDuck poll() {
        Iterator<RubberDuck> rubberDuckIterator = rubberDucks.iterator();
        RubberDuck rubberDuck = rubberDuckIterator.next();
        if(rubberDuck != null){
            rubberDuckIterator.remove();
            return rubberDuck;
        }
        return null;
    }
}
