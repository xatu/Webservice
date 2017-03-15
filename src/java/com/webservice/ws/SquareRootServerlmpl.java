package com.webservice.ws;

import java.util.*;
import javax.jws.*;
        
@WebService(endpointInterface = "com.webservice.ws.SquareRootServer")

public class SquareRootServerlmpl implements SquareRootServer {
    
    public double getSquareRoot(double input) {
        return Math.sqrt(input);
    }

    public String getTime() {
        Date now = new Date();
        return now.toString();
    }
    
    public int getCalculaNumero(int numero) {
        return numero*10;
    }    
}
