package com.salma.tpp.server;

import com.salma.tpp.service.StudentWebService;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import jakarta.xml.ws.Endpoint;

public class ServerSOAP {
    public static void main(String[] args) {
        String url="http://localhost:8081/";
        Endpoint.publish(url,new StudentWebService());
        System.out.println(url);
    }
}
