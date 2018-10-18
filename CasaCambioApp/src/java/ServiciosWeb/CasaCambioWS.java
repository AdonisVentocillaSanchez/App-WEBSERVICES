/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWeb;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author AUTONOMA
 */
@WebService(serviceName = "CasaCambioWS")
@Stateless()
public class CasaCambioWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarDolaresASoles")
    public String cambiarDolaresASoles(@WebParam(name = "monto") double monto) {
        //TODO write your implementation code here:
        String resultado;
        
        double cambio = 0;
        cambio = monto * 3.32;
        resultado = "El cambio en Soles es: " + cambio;
        
        return resultado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "cambiarSolesADolares")
    public String cambiarSolesADolares(@WebParam(name = "monto") double monto) {
        //TODO write your implementation code here:
        String resultado;
        
        double cambio = 0;
        cambio = monto * 0.30;
        resultado = "El cambio en Dolares es: " + cambio;
        
        return resultado;
    }
}
