package com.au.thread;




public class ProducerConsumer
{
    public static void main(String[] args) throws InterruptedException
    {
        final ProducerConsumerUtil ProducerConsumerUtil = new ProducerConsumerUtil();
        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    ProducerConsumerUtil.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    ProducerConsumerUtil.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
 
 
}