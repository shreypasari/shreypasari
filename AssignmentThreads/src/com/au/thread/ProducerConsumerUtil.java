package com.au.thread;

import java.util.LinkedList;

public class ProducerConsumerUtil
{
    LinkedList<Integer> l1 = new LinkedList<>();
    int capacity = 5;
    public void produce() throws InterruptedException
    {
        int value = 1;
        while (true)
        {
            synchronized (this)
            {
                while (l1.size()==capacity)
                    wait();
                System.out.println("Produced : " + value);
                l1.add(value++);
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException
    {
        while (true)
        {
            synchronized (this)
            {
                while (l1.size()==0)
                    wait();
                int val = l1.removeFirst();
                System.out.println("Consumed : "+ val);
                notify();
                Thread.sleep(500);
            }
        }
    }
}