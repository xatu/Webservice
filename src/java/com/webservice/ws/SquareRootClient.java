package com.webservice.ws;

import java.net.*;
import javax.xml.namespace.*;
import javax.xml.ws.*;

public class SquareRootClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/WebService/SquareRootServerlmpl?wsdl");
        QName qname = new QName(
                "http://ws.webservice.com/",
                "SquareRootServerlmplService"
        );
        Service service = Service.create(url, qname);
        SquareRootServer srs = service.getPort(SquareRootServer.class);
        System.out.println(srs.getTime());
        System.out.println(srs.getSquareRoot(625D));
        System.out.println(srs.getCalculaNumero(20));
    }
}
