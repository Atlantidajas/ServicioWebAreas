/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CalcularArea;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jorge
 */
@WebService(serviceName = "CalcularArea")
public class CalcularArea {

    
    
     public CalcularArea(){
     }
    /**
     * Web service operation
     * @param radio
     * @return 
     */
    @WebMethod(operationName = "areaCircuferencia")
    public double areaCircuferencia(@WebParam(name = "radioCircunferencia") double radio) {
        
        final double Pi = Math.PI;
        double areaCircunferencia;
        areaCircunferencia = Pi * Math.pow(radio, 2);
 
        
        return areaCircunferencia;
    }

    /**
     * Web service operation
     * @param base
     * @param altura
     * @return 
     */
    @WebMethod(operationName = "areaTriangulo")
    public double areaTriangulo(@WebParam(name = "base") double base, @WebParam(name = "altura") double altura) {
        
        double areaTriangulo;
        
        areaTriangulo= ( base * altura ) /2;
        
        return areaTriangulo;
    }

    /**
     * Web service operation
     * @param lado
     * @return 
     */
    @WebMethod(operationName = "areaCuadrado")
    public double areaCuadrado(@WebParam(name = "lado") double lado) {
        
        double areaCuadrado;
        
        areaCuadrado = (double)Math.pow(lado, 2);
        
        return areaCuadrado;
    }
}
