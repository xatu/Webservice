package com.webservice.ws;

import javax.jws.*;
import javax.jws.soap.*;
import javax.jws.soap.SOAPBinding.*;

@WebService

@SOAPBinding(style = Style.RPC)

public interface SquareRootServer {
    //obtener la raiz cuadrada de un numero
    @WebMethod double getSquareRoot(double input);
    
    //obtener la fecha y hora actuales como cadena
    @WebMethod String getTime();
    
    //calula numero y lo multplica por 10
    @WebMethod int getCalculaNumero(int numero);
}
