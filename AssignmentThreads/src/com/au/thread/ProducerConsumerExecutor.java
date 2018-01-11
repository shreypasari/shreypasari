package com.au.thread;


import java.util.ArrayList;
import java.util.Iterator;

public class ProducerConsumerExecutor {
	
	ExecutorServiceThreadPool executorServiceThreadPool;
    static ArrayList conData = new ArrayList(); 
    
    public static void main(String[] args) {
        ProducerConsumerExecutor prodconsumer = new ProducerConsumerExecutor();
        prodconsumer.init();
                Iterator itr = conData.iterator(); 
                    while(itr.hasNext()) {
                        Object element = itr.next(); 
                        System.out.print(element + " ");    
                    } 
    }
    private void init() {
        executorServiceThreadPool = new ExecutorServiceThreadPool();
        for(int i = 1; i <= 50; i++){
            executorServiceThreadPool.addThread(new Producer(i));   
            executorServiceThreadPool.addThread(new Consumer(i));
        }
                executorServiceThreadPool.finish();
    }
    private class Producer implements Runnable {
            int data;
            public Producer(int datatoput) {
               data = datatoput;
             }
        @Override
        public void run() {         
            System.out.println("Produced : " + data);
            try {
                executorServiceThreadPool.queue.put(data);
                    Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
    private class Consumer implements Runnable {
                int datatake,data; 
                public Consumer(int datatoput) {
                    data = datatoput;
                  }
        @Override
        public void run() {                                 
                try 
                {
                	System.out.println("Consumed : " + data);
                    datatake = executorServiceThreadPool.queue.take();
                    conData.add(datatake);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
        }
    }
}