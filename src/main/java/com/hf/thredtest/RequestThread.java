package com.hf.thredtest;

import com.hf.service.GetGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestThread.class);
    private GetGen getGen;
    public RequestThread(GetGen getGen){
    this.getGen=getGen;
    }

    @Override
    public void run() {
        LOGGER.info("线程访问");
        getGen.getGen(2);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        LOGGER.info("ffff");
    }
}

