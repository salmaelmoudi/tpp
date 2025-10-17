package com.adc.tpp.server;

import com.adc.tpp.service.StudentWebService;
import jakarta.xml.ws.Endpoint;

public class ServerSOAP {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new StudentWebService());
        System.out.println(url);
    }
}
