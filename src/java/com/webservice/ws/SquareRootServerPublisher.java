package com.webservice.ws;

import javax.xml.ws.*;        

public class SquareRootServerPublisher {
    public static void main(String[] args){
        SquareRootServerlmpl srsi = new SquareRootServerlmpl();
        Endpoint.publish(
                "http://127.0.0.1:5335/service", srsi);
    }
}
